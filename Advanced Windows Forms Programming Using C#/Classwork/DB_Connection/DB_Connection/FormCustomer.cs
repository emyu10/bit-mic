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
    public partial class FormCustomer : Form
    {
        private SqlConnection con = new SqlConnection("Data source = 192.168.122.17; Initial catalog = ChickKing; User id = sa; Password = mql@9933343");
        private SqlCommand com;

        public FormCustomer()
        {
            InitializeComponent();
        }

        private void btnSave_Click(object sender, EventArgs e)
        {
            string sql = "insert into Customer (Name, Phone, Email, Address) values ('" + txtName.Text + "', '" + txtPhone.Text + "', '" + txtEmail.Text + "', '" + txtAddress.Text + "')";
            try
            {
                con.Open();
                com = new SqlCommand(sql, con);
                if (com.ExecuteNonQuery() > 0)
                {
                    MessageBox.Show("Customer saved", "Success");
                }
                else
                {
                    MessageBox.Show("Could not save the customer", "Error");
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show("Could not save the customer\n\n" + ex.Message, "Error");
            }
            finally
            {
                if (con != null) con.Close();
            }
        }

        private void btnSearch_Click(object sender, EventArgs e)
        {
            string sql = "select * from Customer where Name like '%" + txtName.Text + "%' and Phone like '%" + txtPhone.Text + "%' and Email like '%" + txtEmail.Text + "%' and Address like '%" + txtAddress.Text + "%'";
            try
            {
                con.Open();
                com = new SqlCommand(sql, con);
                SqlDataReader r = com.ExecuteReader();
                while (r.Read())
                {
                    txtId.Text = r.GetInt32(0).ToString();
                    txtName.Text = r.GetString(1);
                    txtPhone.Text = r.GetString(2);
                    txtEmail.Text = r.GetString(3);
                    txtAddress.Text = r.GetString(4);
                    break;
                }
                r.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show("Find the customer you are looking for\n\n" + ex.Message, "Error");
            }
            finally
            {
                if (con != null) con.Close();
            }
        }

        private void btnDelete_Click(object sender, EventArgs e)
        {
            string sql = "delete from Customer where Id = " + txtId.Text;
            try
            {
                con.Open();
                com = new SqlCommand(sql, con);
                if (com.ExecuteNonQuery() > 0)
                {
                    MessageBox.Show("Customer deleted", "Success");
                }
                else
                {
                    MessageBox.Show("Could not delete customer", "Error");
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show("Could not delete customer\n\n" + ex.Message, "Error");
            }
            finally
            {
                if (con != null) con.Close();
            }
        }

        private void btnUpdate_Click(object sender, EventArgs e)
        {
            string sql = "update Customer set Name = '" + txtName.Text + "', Phone = '" + txtPhone.Text + "', Email = '" + txtEmail.Text + "', Address = '" + txtAddress.Text + "' where Id = " + txtId.Text;
            try
            {
                con.Open();
                com = new SqlCommand(sql, con);
                if (com.ExecuteNonQuery() > 0)
                {
                    MessageBox.Show("Customer details updated", "Success");
                }
                else
                {
                    MessageBox.Show("Customer could not be updated", "Error");
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show("Customer could not be updated" + ex.Message, "Error");
            }
            finally
            {
                if (con != null) con.Close();
            }
        }
    }
}
