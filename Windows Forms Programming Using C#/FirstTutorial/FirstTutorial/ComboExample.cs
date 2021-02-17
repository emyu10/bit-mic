using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;

namespace FirstTutorial
{
    public partial class ComboExample : Form
    {
        public ComboExample()
        {
            InitializeComponent();
        }

        private void ComboExample_Load(object sender, EventArgs e)
        {
            this.MdiParent = Dashboard.ActiveForm;
            cmbOne.Items.AddRange(new string[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" });
        }

        private void txtAlpha_KeyPress(object sender, KeyPressEventArgs e)
        {
            bool allowed = char.IsLetter(e.KeyChar) || e.KeyChar == (char)Keys.Back || e.KeyChar == (char)Keys.Space || e.KeyChar == '.' || e.KeyChar == ',';
            if (!allowed)
            {
                e.Handled = true;
            }
        }

        private void txtNums_KeyPress(object sender, KeyPressEventArgs e)
        {
            bool allowed = char.IsDigit(e.KeyChar) || e.KeyChar == (char)Keys.Back || e.KeyChar == '.';
            if (!allowed)
            {
                e.Handled = true;
            }
        }
    }
}
