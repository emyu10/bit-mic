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
    public partial class Form1 : Form
    {
        private Dashboard frmDashboard = new Dashboard();
        private AccountForm frmAccount = new AccountForm();
        private AddAccountForm frmAddAccount = new AddAccountForm();

        public Form1()
        {
            InitializeComponent();
        }

        private void dashboardToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (frmDashboard.IsDisposed)
            {
                frmDashboard = new Dashboard();
            }
            frmDashboard.MdiParent = this;
            frmDashboard.Show();
        }

        private void listToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (frmAccount.IsDisposed)
            {
                frmAccount = new AccountForm();
            }
            frmAccount.MdiParent = this;
            frmAccount.Show();
        }

        private void addToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (frmAddAccount.IsDisposed)
            {
                frmAddAccount = new AddAccountForm();
            }
            frmAddAccount.MdiParent = this;
            frmAddAccount.Show();
        }
    }
}
