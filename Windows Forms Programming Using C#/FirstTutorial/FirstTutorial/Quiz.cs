using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;

namespace FirstTutorial
{
    public partial class Quiz : Form
    {
        private int q1 = 0;
        private int q2 = 0;
        private int q3 = 0;

        public Quiz()
        {
            InitializeComponent();
        }

        private void Quiz_Load(object sender, EventArgs e)
        {
            this.MdiParent = Dashboard.ActiveForm;
        }

        private void btnSubmit_Click(object sender, EventArgs e)
        {
            MessageBox.Show((q1 + q2 + q3).ToString());
        }

        private void qOneMaumoon_CheckedChanged(object sender, EventArgs e)
        {
            if (((RadioButton)sender).Text == "Ibrahim Mohamed Solih" && ((RadioButton)sender).Checked)
            {
                q1 = 5;
            }
        }

        private void qTwo3_CheckedChanged(object sender, EventArgs e)
        {
            if (((RadioButton)sender).Text == "2" && ((RadioButton)sender).Checked)
            {
                q2 = 5;
            }
        }

        private void qThreeProgramming_CheckedChanged(object sender, EventArgs e)
        {
            if (((RadioButton)sender).Text == "Programming Language" && ((RadioButton)sender).Checked)
            {
                q3 = 5;
            }
        }
    }
}
