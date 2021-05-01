using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace FormsApp
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnForm2_Click(object sender, EventArgs e)
        {
            (new Form2()).Show();
        }

        private void btnForm3_Click(object sender, EventArgs e)
        {
            (new Form3()).Show();
        }

        private void btnForm4_Click(object sender, EventArgs e)
        {
            (new Form4()).Show();
        }

        private void btnExit_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
