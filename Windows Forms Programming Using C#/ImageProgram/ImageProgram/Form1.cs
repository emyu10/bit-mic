using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ImageProgram
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnSetImage_Click(object sender, EventArgs e)
        {
            Image file;
            OpenFileDialog f = new OpenFileDialog();
            //f.Filter = "JPG (*.JPG)|*.jpg | BMP (*.BMP)|*.bmp";
            if (f.ShowDialog() == DialogResult.OK)
            {
                //file = Image.FromFile(f.FileName);
                //thePicture.Image = file;
                thePicture.ImageLocation = f.FileName;
            }
        }

        private void thePicture_Click(object sender, EventArgs e)
        {

        }

        private void thePicture_MouseClick(object sender, MouseEventArgs e)
        {
            MessageBox.Show("Clicked on X:" + e.X + ", Y:" + e.Y + " position");
        }
    }
}
