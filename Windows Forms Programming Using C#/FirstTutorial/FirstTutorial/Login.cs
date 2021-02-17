using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;

namespace FirstTutorial
{
    public partial class Login : Form
    {
        public Login()
        {
            InitializeComponent();
        }

        private void btnLogin_Click(object sender, EventArgs e)
        {
            if (txtUsername.Text == "bitb02" && txtPassword.Text == "myPrg")
            {
                MessageBox.Show("User logged in");
            } else
            {
                MessageBox.Show("Username or password or both incorrect");
            }
        }

        private void btnCancel_Click(object sender, EventArgs e)
        {
            this.Hide();
        }

        private void Login_Load(object sender, EventArgs e)
        {
            this.MdiParent = Dashboard.ActiveForm;
        }
    }
}
