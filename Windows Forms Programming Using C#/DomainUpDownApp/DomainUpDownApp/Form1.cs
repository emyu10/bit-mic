using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace DomainUpDownApp
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            domainUpDown1.Items.Add("data");
            domainUpDown1.Items.Add("data1");
            domainUpDown1.Items.Add("data2");
            domainUpDown1.Items.Add("data3");
            domainUpDown1.Items.Add("data4");
            domainUpDown1.Text = "";
        }
    }
}
