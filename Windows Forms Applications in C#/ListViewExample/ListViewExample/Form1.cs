using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ListViewExample
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnExit_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            lvOne.View = View.Details;
            lvOne.FullRowSelect = true;
            lvOne.Columns.Add("Name", 150);
            lvOne.Columns.Add("Age", 150);
            lvOne.Columns.Add("Gender", 150);
        }

        private void addData(string name, string age, string gender)
        {
            string[] record = { name, age, gender };
            ListViewItem item = new ListViewItem(record);
            lvOne.Items.Add(item);
        }

        private void btnAdd_Click(object sender, EventArgs e)
        {
            addData(tbName.Text, tbAge.Text, tbGender.Text);
        }

        private void lvOne_MouseClick(object sender, MouseEventArgs e)
        {
            tbName.Text = lvOne.SelectedItems[0].SubItems[0].Text;
            tbAge.Text = lvOne.SelectedItems[0].SubItems[1].Text;
            tbGender.Text = lvOne.SelectedItems[0].SubItems[2].Text;
        }

        private void btnClear_Click(object sender, EventArgs e)
        {
            tbName.Text = "";
            tbAge.Text = "";
            tbGender.Text = "";
            lvOne.SelectedItems.Clear();
        }

        private void updateItem(object sender, EventArgs e)
        {
            lvOne.SelectedItems[0].SubItems[0].Text = tbName.Text;
            lvOne.SelectedItems[0].SubItems[1].Text = tbAge.Text;
            lvOne.SelectedItems[0].SubItems[2].Text = tbGender.Text;
        }

        private void btnRemove_Click(object sender, EventArgs e)
        {
            lvOne.Items.RemoveAt(lvOne.SelectedIndices[0]);
        }
    }
}
