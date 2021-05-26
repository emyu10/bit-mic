using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;
using System.Diagnostics;

namespace DB_Connection
{
    public partial class FormOrders : Form
    {
        private SqlConnection con = new SqlConnection("Data source = 192.168.122.17; Initial catalog = ChickKing; User id = sa; Password = mql@9933343");
        private SqlCommand com;
        private int orderMasterId = 0;

        public FormOrders()
        {
            InitializeComponent();
        }

        private void GetEmployees()
        {
            var sql = "select * from Employee order by Id";
            try
            {
                con.Open();
                com = new SqlCommand(sql, con);
                SqlDataReader r = com.ExecuteReader();
                var employees = new List<Employee>();

                while (r.Read())
                {
                    Employee employee = new Employee(r.GetInt32(0), r.GetString(1), r.GetString(2), r.GetString(3));
                    employees.Add(employee);
                }
                r.Close();
                
                cbxEmployeeId.DataSource = employees;

            }
            catch (Exception ex)
            {
                MessageBox.Show("Could not fetch the employee list\n\n" + ex.Message, "Error");
            }
            finally
            {
                if (con != null) con.Close();
            }
        }

        private void GetCustomers()
        {
            var sql = "select * from Customer order by Id";
            try
            {
                con.Open();
                com = new SqlCommand(sql, con);
                SqlDataReader r = com.ExecuteReader();
                var customers = new List<Customer>();

                while (r.Read())
                {
                    Customer customer = new Customer(r.GetInt32(0), r.GetString(1), r.GetString(2), r.GetString(3), r.GetString(4));
                    customers.Add(customer);
                }
                r.Close();

                cbxCustomerId.DataSource = customers;

            }
            catch (Exception ex)
            {
                MessageBox.Show("Could not fetch the customer list\n\n" + ex.Message, "Error");
            }
            finally
            {
                if (con != null) con.Close();
            }
        }

        private void GetProducts()
        {
            var sql = "select * from Product order by Id";
            try
            {
                con.Open();
                com = new SqlCommand(sql, con);
                SqlDataReader r = com.ExecuteReader();
                var products = new List<Product>();

                while (r.Read())
                {
                    Product product = new Product(r.GetInt32(0), r.GetString(1), r.GetDecimal(2));
                    products.Add(product);
                }
                r.Close();

                cbxProductId.DataSource = products;

            }
            catch (Exception ex)
            {
                MessageBox.Show("Could not fetch the product list\n\n" + ex.Message, "Error");
            }
            finally
            {
                if (con != null) con.Close();
            }
        }

        private void btnSave_Click(object sender, EventArgs e)
        {
            string sql = "insert into OrderMaster (EmpId, CustId, OrderTime) values (" + ((Employee)cbxEmployeeId.SelectedItem).Id + ", " + ((Customer)cbxCustomerId.SelectedItem).Id + ", '" + dtpOrderTime.Value + "')";
            try
            {
                con.Open();
                com = new SqlCommand(sql, con);
                if (com.ExecuteNonQuery() > 0)
                {
                    //MessageBox.Show("Order saved. Add items to the order", "Success");
                    con.Close();
                    PopulateList();
                }
                else
                {
                    MessageBox.Show("Could not save order", "Error");
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show("Could not save order\n\n" + ex.Message, "Error");
            }
            finally
            {
                if (con != null) con.Close();
            }
        }

        private void FormOrders_Load(object sender, EventArgs e)
        {
            GetEmployees();
            GetCustomers();
            GetProducts();
            PopulateList();
        }

        private void btnClear_Click(object sender, EventArgs e)
        {
            
        }

        private void PopulateList()
        {
            try
            {
                con.Open();
                string sql = "select " +
                                "om.Id, " +
	                            "om.EmpId, " +
	                            "e.Name as EmployeeName, " +
	                            "om.CustId, " +
	                            "c.Name as CustomerName, " +
	                            "c.Phone as CustomerPhone, " +
	                            "c.Address as CustomerAddress, " +
	                            "om.OrderTime, " +
	                            "om.Delivered " +
                            "from OrderMaster om " +
                            "left join Employee e on om.EmpId = e.Id " +
                            "left join Customer c on om.CustId = c.Id";
                //Debug.WriteLine(sql);
                SqlDataAdapter adapter = new SqlDataAdapter();
                DataSet ds = new DataSet();
                com = new SqlCommand(sql, con);
                adapter.SelectCommand = com;
                adapter.Fill(ds);
                adapter.Dispose();

                DataView dv = ds.Tables[0].DefaultView;

                orderList.DataSource = dv;
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            finally
            {
                com.Dispose();
                if (con != null) con.Close();
            }
        }

        private void orderList_RowHeaderMouseClick(object sender, DataGridViewCellMouseEventArgs e)
        {
            orderMasterId = (int) orderList.SelectedCells[0].Value;
            ShowOrderItems();
        }

        private void ShowOrderItems()
        {
            if (orderMasterId == 0)
            {
                lblOrderItemsList.Text = "Order Items List";
                return;
            }

            lblOrderItemsList.Text = "Order Items List for Order #" + orderMasterId;

            string sql = "select " +
                            "oi.Id, " +
                            "oi.OrderMasterId, " +
                            "oi.ProductId, " +
                            "p.ProductName, " +
                            "p.Price, " +
                            "oi.Qty " +
                        "from OrderItems oi " +
                        "left join Product p on oi.ProductId = p.Id " +
                        "where OrderMasterId = " + orderMasterId;
            try
            {
                con.Open();
                SqlDataAdapter adapter = new SqlDataAdapter();
                DataSet ds = new DataSet();
                com = new SqlCommand(sql, con);
                adapter.SelectCommand = com;
                adapter.Fill(ds);
                adapter.Dispose();

                DataView dv = ds.Tables[0].DefaultView;
                orderItemsList.DataSource = dv;
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            finally
            {
                com.Dispose();
                if (con != null) con.Close();
            }
        }

        private void AddProductToOrder()
        {

        }

        private void btnAddItem_Click(object sender, EventArgs e)
        {
            if (orderMasterId == 0)
            {
                MessageBox.Show("Select an order first");
                return;
            }

            try
            {
                string sql = "insert into OrderItems (OrderMasterId, ProductId, Qty) values (" + orderMasterId + ", " + ((Product)cbxProductId.SelectedItem).Id + ", " + float.Parse(txtQuantity.Text) + ")";
                con.Open();

                com = new SqlCommand(sql, con);
                if (com.ExecuteNonQuery() > 0)
                {
                    con.Close();
                    ShowOrderItems();
                }
                else
                {
                    MessageBox.Show("Could not add product to the order");
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            finally
            {
                if (con != null) con.Close();
            }
        }

        /*
         try
            {

            }
            catch (Exception ex)
            {

            }
            finally
            {

            }
        */
    }
}
