using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace FirstTutorial
{
    public partial class Adder : Form
    {
        public Adder()
        {
            InitializeComponent();
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void txtOne_Leave(object sender, EventArgs e)
        {
            txtOne.Enabled = false;
        }

        private void btnExit_Click(object sender, EventArgs e)
        {
            this.Hide();
        }

        private void btnCalc_MouseHover(object sender, EventArgs e)
        {
            
        }

        private void btnCalc_MouseEnter(object sender, EventArgs e)
        {
            btnCalc.BackColor = Color.Gray;
        }

        private void btnCalc_MouseLeave(object sender, EventArgs e)
        {
            btnCalc.BackColor = Color.White;
        }

        private void Adder_Load(object sender, EventArgs e)
        {
            lblOne.ForeColor = Color.Red;
            lblTwo.BackColor = Color.Cyan;
            lblResult.Font = new Font("Times new Roman", 26, FontStyle.Bold | FontStyle.Strikeout);

            string[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
            /*
            lbxCountries.Items.Add("Maldives");
            lbxCountries.Items.Add("India");
            lbxCountries.Items.Add("Sri Lanka");
            lbxCountries.Items.Add("Pakistan");
            lbxCountries.Items.Add("China");
            lbxCountries.Items.Add("Nepal");
            lbxCountries.Items.Add("Bangladesh");
            */
            lbxCountries.Items.AddRange(months);
            clbExample.Items.AddRange(months);
            this.MdiParent = Dashboard.ActiveForm;
        }

        private void Adder_Click(object sender, EventArgs e)
        {
            //Form formTwo = new Form();
            //formTwo.Text = "Form Two";
            //Button btnThree = new Button();
            //btnThree.Text = "Test";
            //formTwo.Controls.Add(btnThree);
            //btnThree.Location = new Point(250, 250);
            //formTwo.Show();
        }
    }
}
