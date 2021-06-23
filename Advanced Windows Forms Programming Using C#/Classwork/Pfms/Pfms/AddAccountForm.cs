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
        private string title = "Add Account";
        private int accountId = -1;

        public AddAccountForm()
        {
            InitializeComponent();
        }

        public void SetTitle(string title = "Add Account")
        {
            this.title = title;
            this.Text = this.title;
        }

        public void SetAccountId(int accountId)
        {
            this.accountId = accountId;
        }

        private void SaveRecord()
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
                decimal max = txtMax.Text == "" ? -1 : decimal.Parse(txtMax.Text);
                decimal min = txtMin.Text == "" ? -1 : decimal.Parse(txtMin.Text);
                decimal balance = txtBalance.Text == "" ? -1 : decimal.Parse(txtBalance.Text);
                var result = Account.Save(title, description, parentId, max, min);
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
            catch (Exception)
            {
                MessageBox.Show("Could not save account");
            }
        }

        private void UpdateRecord()
        {
            bool filled = txtTitle.Text != "";
            if (!filled)
            {
                MessageBox.Show("Please enter a title");
                return;
            }
            try
            {
                int id = int.Parse(txtId.Text);
                var title = txtTitle.Text;
                var description = txtDescription.Text;
                var parentId = txtParentId.Text == "" ? -1 : Int32.Parse(txtParentId.Text);
                decimal max = txtMax.Text == "" ? -1 : decimal.Parse(txtMax.Text);
                decimal min = txtMin.Text == "" ? -1 : decimal.Parse(txtMin.Text);
                var result = Account.Update(id, title, description, parentId, max, min);
                if (result) MessageBox.Show("Account information udpated");
                else MessageBox.Show("Could not update account information");
            }
            catch (FormatException)
            {
                MessageBox.Show("Please enter the values in the correct format");
            }
            catch (Exception)
            {
                MessageBox.Show("Could not update account information");
            }
        }

        private void btnSave_Click(object sender, EventArgs e)
        {
            if (accountId != -1)
            {
                UpdateRecord();
            }
            else
            {
                SaveRecord();
            }
        }

        private void btnCancel_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void AddAccountForm_Load(object sender, EventArgs e)
        {
            MdiParent = Form1.ActiveForm;

            if (accountId != -1)
            {
                btnSave.Text = "Update";
                try
                {
                    var account = Account.GetAccountById(accountId);
                    LoadFromAccount(account);
                }
                catch (Exception ex)
                {
                    MessageBox.Show("Could not load account details.\n" + ex.Message);
                }
            }
        }

        private void LoadFromAccount(Account account)
        {
            txtId.Text = account.Id == -1 ? "" : account.Id.ToString();
            txtTitle.Text = account.Title;
            txtDescription.Text = account.Description;
            txtParentId.Text = account.ParentId == -1 ? "" : account.ParentId.ToString();
            txtMax.Text = account.MaxAmount == -1 ? "" : account.MaxAmount.ToString();
            txtMin.Text = account.MinAmount == -1 ? "" : account.MinAmount.ToString();
            txtBalance.Text = account.CurrentBalance == -1 ? "" : account.CurrentBalance.ToString();
            dtAdded.Value = account.AddedDate;
        }
    }
}
