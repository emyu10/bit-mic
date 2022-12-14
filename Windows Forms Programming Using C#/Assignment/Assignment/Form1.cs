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
            profilePhoto.ImageLocation = "C:\\Path\\To\\Some\\Image.png";
            profilePhoto.Load();

            dobPicker.SetBounds(50, 50, 100, 50);

            ImageList socialPhotos = new ImageList();
            socialPhotos.ImageSize = new Size(500, 500);
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

        private void profilePhoto_LoadProgressChanged(object sender, ProgressChangedEventArgs e)
        {
            imageProgress.Value = e.ProgressPercentage;
        }

        private void dobPicker_CloseUp(object sender, EventArgs e)
        {
            if (dobPicker.Value < new DateTime(1990, 12, 31))
            {
                MessageBox.Show("Please choose a date after December 31, 1990");
            }
        }

        private void test()
        {
            socialPhotos.Draw(g, pt, 1)
        }
    }
}
