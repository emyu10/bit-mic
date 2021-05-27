using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Drawing.Drawing2D;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace HatchBrushExample
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Paint(object sender, PaintEventArgs e)
        {
            int y = 20, x = 20;
            Font font = new Font("Tahoma", 8);

            // iterate over all the styles
            foreach (HatchStyle brushStyle in Enum.GetValues(typeof(HatchStyle)))
            {
                HatchBrush brush = new HatchBrush(brushStyle, Color.Blue, Color.LightYellow);

                // fill a rectangle with the brush.
                e.Graphics.FillRectangle(brush, x, y, 40, 20);

                //display the brush name
                e.Graphics.DrawString(brushStyle.ToString(), font, Brushes.Black, 50 + x, y + 5);

                y += 30;

                if ((y + 30) > ClientSize.Height)
                {
                    y = 20;
                    x += 180;
                }

                brush.Dispose();
            }

            font.Dispose();
        }
    }
}
