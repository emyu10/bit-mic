using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Pfms
{
    public partial class AddAccountForm : Form
    {
        public AddAccountForm()
        {
            InitializeComponent();
        }

        private void btnSave_Click(object sender, EventArgs e)
        {
            bool filled = txtTitle.Text != "";
            if (!filled)
            {
                MessageBox.Show("Please enter a title");
                return;
            }
            try
            {
                var title = txtTitle.Text;
                var description = txtDescription.Text;
                var parentId = txtParentId.Text == "" ? -1 : Int32.Parse(txtParentId.Text);
                decimal max = txtMax.Text == "" ? 0 : decimal.Parse(txtMax.Text);
                decimal min = txtMin.Text == "" ? 0 : decimal.Parse(txtMin.Text);
                decimal balance = txtBalance.Text == "" ? 0 : decimal.Parse(txtBalance.Text);
                var result = Account.Save(title, description, parentId, max, min, balance);
                if (result)
                {
                    MessageBox.Show("Account saved");
                }
                else
                {
                    MessageBox.Show("Could not save account");
                }
            }
            catch (FormatException)
            {
                MessageBox.Show("Please enter the values in the correct format");
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void btnCancel_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
