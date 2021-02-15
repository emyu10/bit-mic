using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ImageListProgram
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnAdd_Click(object sender, EventArgs e)
        {
            OpenFileDialog fd = new OpenFileDialog();
            if (fd.ShowDialog() == DialogResult.OK)
            {
                string s = fd.FileName;
                photoList.Images.Add(Image.FromFile(s));
            }
        }

        private void btnShow_Click(object sender, EventArgs e)
        {
            Graphics g = Graphics.FromHwnd(this.Handle);
            photoList.ColorDepth = ColorDepth.Depth32Bit;

            photoList.ImageSize = new Size(100, 100);

            for (int count = 0; count < photoList.Images.Count; count++)
            {
                photoList.Draw(g, new Point(100, 100), count);
                System.Threading.Thread.Sleep(1000);
            }
        }
    }
}
