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
    public partial class FormProducts : Form
    {
        private SqlConnection con = new SqlConnection("Data source = 192.168.122.17; Initial catalog = ChickKing; User id = sa; Password = mql@9933343");
        private SqlCommand com;

        public FormProducts()
        {
            InitializeComponent();
        }

        private void btnSave_Click(object sender, EventArgs e)
        {
            string sql = "insert into Product (ProductName, Price) values ('" + txtName.Text + "', " + txtPrice.Text + ")";
            try
            {
                con.Open();
                com = new SqlCommand(sql, con);
                if (com.ExecuteNonQuery() > 0)
                {
                    MessageBox.Show("Product saved", "Success");
                }
                else
                {
                    MessageBox.Show("Could not save the product", "Error");
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show("Could not save product\n\n" + ex.Message, "Error");
            }
            finally
            {
                if (con != null) con.Close();
            }
        }

        private void btnSearch_Click(object sender, EventArgs e)
        {
            string sql = "select * from Product where ProductName like '%" + txtName.Text + "%'";
            try
            {
                con.Open();
                com = new SqlCommand(sql, con);
                SqlDataReader r = com.ExecuteReader();

                while (r.Read())
                {
                    txtId.Text = r.GetInt32(0).ToString();
                    txtName.Text = r.GetString(1);
                    txtPrice.Text = r.GetValue(2).ToString();
                    break;
                }
                r.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show("Could not find what you are looking for\n\n" + ex.Message, "Error");
            }
            finally
            {
                if (con != null) con.Close();
            }
        }

        private void btnDelete_Click(object sender, EventArgs e)
        {
            string sql = "delete from Product where Id = " + txtId.Text;
            try
            {
                con.Open();
                com = new SqlCommand(sql, con);
                if (com.ExecuteNonQuery() > 0)
                {
                    MessageBox.Show("Product deleted", "Success");
                }
                else
                {
                    MessageBox.Show("Could not delete the product", "Error");
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show("Could not delete the product\n\n" + ex.Message, "Error");
            }
            finally
            {
                if (con != null) con.Close();
            }
        }

        private void btnUpdate_Click(object sender, EventArgs e)
        {
            string sql = "update Product set ProductName = '" + txtName.Text + "', Price = " + txtPrice.Text + " where Id = " + txtId.Text;
            try
            {
                con.Open();
                com = new SqlCommand(sql, con);
                if (com.ExecuteNonQuery() > 0)
                {
                    MessageBox.Show("Product details updated", "Success");
                }
                else
                {
                    MessageBox.Show("Could not update the product", "Error");
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show("Could not update the product\n\n" + ex.Message, "Error");
            }
            finally
            {
                if (con != null) con.Close();
            }
        }
    }
}
