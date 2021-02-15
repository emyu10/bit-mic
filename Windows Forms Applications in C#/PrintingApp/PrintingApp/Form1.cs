using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace PrintingApp
{
    public partial class Form1 : Form
    {
        Bitmap bmp;

        public Form1()
        {
            InitializeComponent();
        }

        private void btnExit_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void txtUnitPrice_Leave(object sender, EventArgs e)
        {
            double totalPrice = 0;
            if (txtQty.Text != "" && txtUnitPrice.Text != "")
            {
                totalPrice = double.Parse(txtQty.Text) * double.Parse(txtUnitPrice.Text);
                txtTotal.Text = totalPrice.ToString();
            }
        }

        private void btnPrint_Click(object sender, EventArgs e)
        {
            printInvoice.AllowSelection = true;
            printInvoice.AllowSomePages = true;
            if (printInvoice.ShowDialog() == DialogResult.OK)
            {
                docToPrint.Print();
            }
        }

        private void btnPreview_Click(object sender, EventArgs e)
        {
            Graphics g = this.CreateGraphics();
            bmp = new Bitmap(this.Size.Width, this.Size.Height, g);
            Graphics g1 = Graphics.FromImage(bmp);
            g1.CopyFromScreen(this.Location.X, this.Location.Y, 0, 0, this.Size);
            ppvd.Document = docToPrint;
            ppvd.ShowDialog();
        }

        private void docToPrint_PrintPage(object sender, System.Drawing.Printing.PrintPageEventArgs e)
        {
            //e.Graphics.DrawImage(bmp, 50, 100);
            bmp = new Bitmap(this.pictureBox1.Image);
            e.Graphics.DrawImage(bmp, 250, 25, 100, 100);

            e.Graphics.DrawString(DateTime.Now.ToString("dd/MM/yyyy"), new Font("Arial", 16, FontStyle.Italic), Brushes.Black, new Point(450, 200));


            e.Graphics.DrawString("Item Name", new Font("Arial", 20, FontStyle.Bold), Brushes.Black, new Point(50, 300));
            e.Graphics.DrawString("Quantity", new Font("Arial", 20, FontStyle.Bold), Brushes.Black, new Point(250, 300));
            e.Graphics.DrawString("Unit Price", new Font("Arial", 20, FontStyle.Bold), Brushes.Black, new Point(450, 300));

            e.Graphics.DrawLine(new Pen(Brushes.Black), new Point(50, 350), new Point(600, 350));
            e.Graphics.DrawLine(new Pen(Brushes.Black), new Point(50, 355), new Point(600, 355));

            string itemName = txtItemName.Text.Length <= 15 ? txtItemName.Text : txtItemName.Text.Substring(0, 12) + "...";
            e.Graphics.DrawString(itemName, new Font("Arial", 20, FontStyle.Regular), Brushes.Black, new Point(50, 370));
            e.Graphics.DrawString(txtQty.Text, new Font("Arial", 20, FontStyle.Regular), Brushes.Black, new Point(250, 370));
            e.Graphics.DrawString(txtUnitPrice.Text, new Font("Arial", 20, FontStyle.Regular), Brushes.Black, new Point(450, 370));

            e.Graphics.DrawLine(new Pen(Brushes.Black), new Point(50, 500), new Point(600, 500));
            e.Graphics.DrawLine(new Pen(Brushes.Black), new Point(50, 505), new Point(600, 505));

            e.Graphics.DrawString("Total Price", new Font("Arial", 20, FontStyle.Bold), Brushes.Black, new Point(50, 520));
            e.Graphics.DrawString(txtTotal.Text, new Font("Arial", 20, FontStyle.Regular), Brushes.Black, new Point(520, 520));

        }
    }
}
