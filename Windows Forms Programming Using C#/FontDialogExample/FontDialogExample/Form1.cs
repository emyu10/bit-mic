using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace FontDialogExample
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnFont_Click(object sender, EventArgs e)
        {
            if (fnt.ShowDialog() == DialogResult.OK)
            {
                rtb.Font = fnt.Font;
            }
        }

        private void btnColor_Click(object sender, EventArgs e)
        {
            if (clr.ShowDialog() == DialogResult.OK)
            {
                this.BackColor = clr.Color;
            }
        }

        private void btnExit_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void btnOpen_Click(object sender, EventArgs e)
        {
            if (ofd.ShowDialog() == DialogResult.OK)
            {
                rtb.LoadFile(ofd.FileName, RichTextBoxStreamType.PlainText);
            }
        }

        private void btnSave_Click(object sender, EventArgs e)
        {
            if (sfd.ShowDialog() == DialogResult.OK)
            {
                rtb.SaveFile(sfd.FileName, RichTextBoxStreamType.PlainText);
            }
        }

        private void btnVisit_Click(object sender, EventArgs e)
        {
            webB.Url = new Uri(txtAddress.Text);
            webB.Update();

        }

        private void btnFolder_Click(object sender, EventArgs e)
        {
            if (folderDialog.ShowDialog() == DialogResult.OK)
            {
                string folderName = folderDialog.SelectedPath;
                foreach (string s in System.IO.Directory.GetFiles(folderName))
                {
                    rtb.Text += s + "\n";
                }
            }
        }
    }
}
