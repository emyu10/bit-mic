using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace PictureBoxAndImageList
{
    public partial class Form1 : Form
    {
        private int pos = 0;

        public Form1()
        {
            InitializeComponent();
        }

        private void btnAdd_Click(object sender, EventArgs e)
        {
            OpenFileDialog fd = new OpenFileDialog();
            if (fd.ShowDialog() == DialogResult.OK)
            {
                photoList.Images.Add(Image.FromFile(fd.FileName));
            }
            thePicture.Image = photoList.Images[pos];
        }

        private void btnPrevious_Click(object sender, EventArgs e)
        {
            if (pos > 0)
            {
                thePicture.Image = photoList.Images[--pos];
            }
        }

        private void btnNext_Click(object sender, EventArgs e)
        {
            if (pos < (photoList.Images.Count - 1))
            {
                thePicture.Image = photoList.Images[++pos];
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            photoList.ImageSize = new Size(256, 200);
        }

        private void btnStart_Click(object sender, EventArgs e)
        {
            for (int i = 0; i < photoList.Images.Count; i++)
            {
                if (i == photoList.Images.Count)
                {
                    i = 0;
                }
                thePicture.Image = photoList.Images[i];
                System.Threading.Thread.Sleep(1000);
            }
        }
    }
}
