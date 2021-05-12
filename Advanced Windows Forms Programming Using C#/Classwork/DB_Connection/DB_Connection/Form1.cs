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
    public partial class Form1 : Form
    {
        private SqlConnection con = new SqlConnection("Data source = 192.168.122.17; Initial catalog = ChickKing; User id = sa; Password = mql@9933343");
        private SqlCommand cmd;

        public Form1()
        {
            InitializeComponent();
        }

        public void Connect()
        {
            con = new SqlConnection("Data source = 192.168.122.17; Initial catalog = ChickKing; User id = sa; Password = mql@9933343");
            try
            {
                con.Open();
                MessageBox.Show("Connected to the database");
            }
            catch (Exception e)
            {
                MessageBox.Show(e.Message);
            }
            finally
            {
                if (con != null)
                {
                    con.Close();
                }
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            //Connect();
        }

        private void btnSave_Click(object sender, EventArgs e)
        {
            string sql = "insert into Employee (Name, Username, Email, Password) values ('" + txtName.Text +"', '" + txtUsername.Text +"', '" + txtEmail.Text +"', '" + txtPassword.Text +"')";
            try
            {
                con.Open();

                cmd = new SqlCommand(sql, con);
                if (cmd.ExecuteNonQuery() > 0)
                {
                    MessageBox.Show("Employee Saved");
                    ClearBoxes();
                }
                else
                {
                    MessageBox.Show("Could not save the employee");
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show("Could not save the employee\n\n" + ex.Message);
            }
            finally
            {
                if (con != null)
                {
                    con.Close();
                }
            }
        }

        private void btnSearch_Click(object sender, EventArgs e)
        {
            string sql = "select * from Employee where Name like '%" + txtName.Text + "%' and Username like '%" + txtUsername.Text + "%' and Email like '%" + txtEmail.Text + "%'";

            try
            {
                con.Open();
                cmd = new SqlCommand(sql, con);

                SqlDataReader r = cmd.ExecuteReader();

                while (r.Read())
                {
                    txtId.Text = r.GetInt32(0).ToString();
                    txtName.Text = r.GetString(1);
                    txtUsername.Text = r.GetString(2);
                    txtEmail.Text = r.GetString(3);
                    txtPassword.Text = r.GetString(4);
                    txtActive.Text = r.GetValue(5).ToString();
                    break;
                }
                r.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show("Could not find\n\n" + ex.Message);
            }
            finally
            {
                if (con != null)
                {
                    con.Close();
                }
            }
        }

        private void ClearBoxes()
        {
            txtId.Clear();
            txtName.Clear();
            txtUsername.Clear();
            txtEmail.Clear();
            txtPassword.Clear();
            txtActive.Clear();
        }

        private void btnClear_Click(object sender, EventArgs e)
        {
            ClearBoxes();
        }

        private void btnUpdate_Click(object sender, EventArgs e)
        {
            string sql = "update Employee set Name = '" + txtName.Text + "', Username = '" + txtUsername.Text + "', Email = '" + txtEmail.Text + "', Password = '" + txtPassword.Text + "', Active = " + Int16.Parse(txtActive.Text) + " where Id = " + txtId.Text;

            try
            {
                con.Open();
                cmd = new SqlCommand(sql, con);

                if (cmd.ExecuteNonQuery() > 0)
                {
                    MessageBox.Show("Employee updated");
                }
                else
                {
                    MessageBox.Show("Could not update the employee");
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show("Could not update the employee\n\n" + ex.Message);
            }
            finally
            {
                if (con != null) con.Close();
            }
        }

        private void btnDelete_Click(object sender, EventArgs e)
        {
            string sql = "delete from Employee where Id = " + txtId.Text;

            try
            {
                con.Open();
                cmd = new SqlCommand(sql, con);
                if (cmd.ExecuteNonQuery() > 0)
                {
                    MessageBox.Show("Employee deleted");
                    ClearBoxes();
                }
                else
                {
                    MessageBox.Show("Could not delete the employee");
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show("Could not delete the employee\n\n" + ex.Message);
            }
            finally
            {
                if (con != null) con.Close();
            }
        }

        private void linkLabel1_Click(object sender, EventArgs e)
        {
            (new FormProducts()).Show();
        }

        private void linkLabel2_Click(object sender, EventArgs e)
        {
            (new FormCustomer()).Show();
        }

        private void linkLabel3_Click(object sender, EventArgs e)
        {
            (new FormOrders()).Show();
        }
    }
}
