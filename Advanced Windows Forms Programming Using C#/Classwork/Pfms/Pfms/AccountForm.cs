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
    public partial class AccountForm : Form
    {
        public AccountForm()
        {
            InitializeComponent();
        }

        private void AccountForm_Load(object sender, EventArgs e)
        {
            try
            {
                tvAccounts.Nodes.Clear();
                var accounts = Account.GetAllAccounts();
                List<TreeNode> treenodes = new List<TreeNode>();
                foreach (Account a in accounts)
                {
                    if (a.ParentId == -1)
                    {
                        tvAccounts.Nodes.Add(a.Id.ToString(), a.Info());
                    }
                    else
                    {
                        TreeNode[] tnc = tvAccounts.Nodes.Find(a.ParentId.ToString(), true);
                        foreach (TreeNode tn in tnc)
                        {
                            tn.Nodes.Add(a.Id.ToString(), a.Info());
                        }
                    }
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            
        }

        private void btnRefresh_Click(object sender, EventArgs e)
        {
            this.AccountForm_Load(sender, e);
        }

        private void tvAccounts_NodeMouseClick(object sender, TreeNodeMouseClickEventArgs e)
        {
            if (e.Button == MouseButtons.Right)
            {
                var options = new AccountOptionsForm();
                options.SetDetails(e.Node.Text);
                options.SetAccountId(int.Parse(e.Node.Name));
                options.Show();
            }
        }
    }
}
