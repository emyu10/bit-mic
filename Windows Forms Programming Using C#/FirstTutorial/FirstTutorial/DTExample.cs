using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;

namespace FirstTutorial
{
    public partial class DTExample : Form
    {
        private int currentFormat = 0;
        
        public DTExample()
        {
            InitializeComponent();
        }

        private void btnFormat_Click(object sender, EventArgs e)
        {
            string[] formats = { "d/M/yy", "dd/MM/yyy", "ddd MMM yyyy", "hh:mm" };
            dtOne.Format = DateTimePickerFormat.Custom;
            dtOne.CustomFormat = formats[currentFormat];
            if (currentFormat == formats.Length - 1)
            {
                currentFormat = 0;
            } else
            {
                currentFormat++;
            }
        }

        private void btnTwo_Click(object sender, EventArgs e)
        {
            DateTime d = new DateTime(1983, 6, 6, 5, 36, 55);
            txtShowDate.Text = d.ToString("dddd-MM");
        }

        private void btnDifference_Click(object sender, EventArgs e)
        {
            TimeSpan span = dtEnd.Value.Subtract(dtStart.Value);
            double days = span.TotalDays;
            double hours = span.TotalHours;
            double minutes = span.TotalMinutes;
            MessageBox.Show(span.ToString());
        }

        private void DTExample_Load(object sender, EventArgs e)
        {
            this.MdiParent = Dashboard.ActiveForm;
        }
    }
}
