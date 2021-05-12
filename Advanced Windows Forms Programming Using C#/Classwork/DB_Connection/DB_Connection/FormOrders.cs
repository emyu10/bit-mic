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

namespace DB_Connection
{
    public partial class FormOrders : Form
    {
        private SqlConnection con = new SqlConnection("Data source = 192.168.122.17; Initial catalog = ChickKing; User id = sa; Password = mql@9933343");
        private SqlCommand com;

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

        private void btnSave_Click(object sender, EventArgs e)
        {
            string sql = "insert into OrderMaster (EmpId, CustId, OrderTime) values (" + ((Employee)cbxEmployeeId.SelectedItem).Id + ", " + ((Customer)cbxCustomerId.SelectedItem).Id + ", '" + dtpOrderTime.Value + "')";
            try
            {
                con.Open();
                com = new SqlCommand(sql, con);
                if (com.ExecuteNonQuery() > 0)
                {
                    MessageBox.Show("Order saved. Add items to the order", "Success");
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
        }

        private void btnClear_Click(object sender, EventArgs e)
        {
            
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
