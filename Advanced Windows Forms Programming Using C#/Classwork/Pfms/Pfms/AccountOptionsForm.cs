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
    public partial class AccountOptionsForm : Form
    {
        private string details = "Options for ";
        private int accountId = -1;
        private Account account = null;

        public AccountOptionsForm()
        {
            InitializeComponent();
        }

        private void btnCancel_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        public void SetDetails(string details)
        {
            this.details += details;
        }

        public void SetAccountId(int accountId)
        {
            this.accountId = accountId;
            try
            {
                account = Account.GetAccountById(accountId);
                
            }
            catch
            {
            }
        }

        private void AccountOptionsForm_Load(object sender, EventArgs e)
        {
            MdiParent = Form1.ActiveForm;
            lblDetails.Text = this.details;
        }

        private void btnTransactions_Click(object sender, EventArgs e)
        {
            TransactionForm transForm = new TransactionForm();
            transForm.SetAccount(account);
            transForm.Show();
            this.Close();
        }

        private void btnDetails_Click(object sender, EventArgs e)
        {
            AddAccountForm details = new AddAccountForm();
            details.SetTitle("Account Details");
            details.SetAccountId(accountId);
            details.Show();
            this.Close();
        }
    }
}
