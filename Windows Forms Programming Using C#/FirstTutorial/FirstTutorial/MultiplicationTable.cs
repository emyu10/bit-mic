using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;

namespace FirstTutorial
{
    public partial class MultiplicationTable : Form
    {
        public MultiplicationTable()
        {
            InitializeComponent();
        }

        private void MultiplicationTable_Load(object sender, EventArgs e)
        {
            this.MdiParent = Dashboard.ActiveForm;
        }

        private void btnShow_Click(object sender, EventArgs e)
        {
            try
            {
                int term = int.Parse(txtTerm.Text);
                int level = int.Parse(txtLevel.Text);
                lbxTable.Items.Clear();
                for (int i = 1; i <= level; i++)
                {
                    string item = i + " x " + term + " = " + (i * term);
                    lbxTable.Items.Add(item);
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }
    }
}
