using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;

namespace FirstTutorial
{
    public partial class Age : Form
    {
        public Age()
        {
            InitializeComponent();
        }

        private void btnCalculate_Click(object sender, EventArgs e)
        {
            DateTime currentDate = DateTime.Now;
            DateTime dob = dtDob.Value;
            TimeSpan age = currentDate.Subtract(dob);
            double days = age.TotalDays;
            int years = (int) (days / 365.25);
            int remDays = (int) (days - (years * 365.25));//(int) days % 365;
            int months = 0;
            if (remDays > 30)
            {
                months = remDays / 30;
                remDays = remDays % 30;
            }
            txtYear.Text = years.ToString();
            txtMonths.Text = months.ToString();
            txtDays.Text = remDays.ToString();
        }

        private void Age_Load(object sender, EventArgs e)
        {
            this.MdiParent = Dashboard.ActiveForm;
        }
    }
}
