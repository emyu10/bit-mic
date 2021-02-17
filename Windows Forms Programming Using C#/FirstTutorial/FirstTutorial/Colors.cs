using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;

namespace FirstTutorial
{
    public partial class Colors : Form
    {
        public Colors()
        {
            InitializeComponent();
        }

        private void changeColors()
        {
            int red = (int)spinRed.Value;
            int green = (int)spinGreen.Value;
            int blue = (int)spinBlue.Value;
            Color color = Color.FromArgb(red, green, blue);
            panelDisplay.BackColor = color;
        }

        private void btnExit_Click(object sender, EventArgs e)
        {
            this.Hide();
        }

        private void Colors_Load(object sender, EventArgs e)
        {
            changeColors();
            this.MdiParent = Dashboard.ActiveForm;
        }

        private void spinnerValueChanged(object sender, EventArgs e)
        {
            changeColors();
        }
    }
}
