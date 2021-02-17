using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Assignment
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            lblName.Text = "Name: ";
            lblName.ForeColor = Color.Red;
            string[] strDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
            days.Items.AddRange(strDays);
            string[] names = { "Hawwa", "Maryam", "Aishath", "Aminath", "Fathimath" };
            lbNames.Items.AddRange(names);
            checkHide.Hide();
        }

        private void lblName_Click(object sender, EventArgs e)
        {
            txtName.Focus();
        }

        private void days_SelectedIndexChanged(object sender, EventArgs e)
        {
            ComboBox cbx = (ComboBox)sender;
            MessageBox.Show((string)cbx.Items[cbx.SelectedIndex]);
        }

        private void lbNames_Leave(object sender, EventArgs e)
        {
            MessageBox.Show((string)lbNames.SelectedItem);
            gbxGender.BackColor = Color.White;
            gbxGender.FindForm().BackColor = Color.Red;
        }

        private void gbxGender_ControlAdded(object sender, ControlEventArgs e)
        {
            MessageBox.Show("A new control is added to the groupbox");
        }

        private void rdbMale_CheckedChanged(object sender, EventArgs e)
        {
            if (((RadioButton)sender).Checked)
            {
                MessageBox.Show("Are you sure you are a male?");
            }
        }

        private void checkHide_AppearanceChanged(object sender, EventArgs e)
        {
            
        }

        private void checkHide_CheckStateChanged(object sender, EventArgs e)
        {
            
        }

        private void checkHide_CheckedChanged(object sender, EventArgs e)
        {
            if (((CheckBox)sender).Checked)
            {
                ((CheckBox)sender).Hide();
            }
        }
    }
}
