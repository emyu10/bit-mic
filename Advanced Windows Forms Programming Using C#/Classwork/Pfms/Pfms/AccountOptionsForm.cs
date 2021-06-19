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
        private int accountId;

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
        }

        private void AccountOptionsForm_Load(object sender, EventArgs e)
        {
            lblDetails.Text = this.details;
        }
    }
}
