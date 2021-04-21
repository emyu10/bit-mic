using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;

namespace FirstTutorial
{
    public partial class Calculator : Form
    {
        private string op;
        private bool start = true;
        private double left;
        private double right;
        private double result;

        public Calculator()
        {
            InitializeComponent();
        }

        /************************************************* form actions ******************************************/
        private void TurnOff()
        {
            btn9.Enabled = false;
            btnClear.Enabled = false;
            btnEqual.Enabled = false;
            btnPlus.Enabled = false;
            btn6.Enabled = false;
            btn7.Enabled = false;
            btn8.Enabled = false;
            btnMinus.Enabled = false;
            btn3.Enabled = false;
            btn4.Enabled = false;
            btn5.Enabled = false;
            btnMultiply.Enabled = false;
            btn0.Enabled = false;
            btnDot.Enabled = false;
            btn1.Enabled = false;
            btn2.Enabled = false;
            btnDivide.Enabled = false;
            btnOff.Enabled = false;
            txtDisplay.Enabled = false;
            btnOn.Enabled = true;
        }

        private void TurnOn()
        {
            btn9.Enabled = true;
            btnClear.Enabled = true;
            btnEqual.Enabled = true;
            btnPlus.Enabled = true;
            btn6.Enabled = true;
            btn7.Enabled = true;
            btn8.Enabled = true;
            btnMinus.Enabled = true;
            btn3.Enabled = true;
            btn4.Enabled = true;
            btn5.Enabled = true;
            btnMultiply.Enabled = true;
            btn0.Enabled = true;
            btnDot.Enabled = true;
            btn1.Enabled = true;
            btn2.Enabled = true;
            btnDivide.Enabled = true;
            btnOn.Enabled = false;
            btnOff.Enabled = true;
        }

        private void Calculator_Load(object sender, EventArgs e)
        {
            this.MdiParent = Dashboard.ActiveForm;
            TurnOff();
        }

        private void btnExit_Click(object sender, EventArgs e)
        {
            this.Hide();
        }

        private void btnOff_Click(object sender, EventArgs e)
        {
            TurnOff();
        }

        private void btnOn_Click(object sender, EventArgs e)
        {
            TurnOn();
        }

        private void btnClear_Click(object sender, EventArgs e)
        {
            txtDisplay.Text = "0";
            result = 0;
            left = 0;
            right = 0;
            op = null;
        }


        /************************************************* operator methods **************************************/
        private void setOp(object sender, EventArgs e)
        {
            if (op != null)
            {
                MessageBox.Show("Going crazy");
                return;
            }
            left = double.Parse(txtDisplay.Text);
            op = ((Button)sender).Text;
            start = true;
        }

        private void btnDot_Click(object sender, EventArgs e)
        {
            if (!txtDisplay.Text.Contains('.'))
            {
                txtDisplay.Text = txtDisplay.Text + ".";
            }
        }

        private void btnEqual_Click(object sender, EventArgs e)
        {
            //if (left == null)
            //{
            //    MessageBox.Show("Enter some values first");
            //}
            right = double.Parse(txtDisplay.Text);
            switch (op)
            {
                case "+":
                    result = left + right;
                    break;
                case "-":
                    result = left - right;
                    break;
                case "x":
                    result = left * right;
                    break;
                case "/":
                    if (right == 0)
                    {
                        MessageBox.Show("Division by Zero is not allowed");
                        break;
                    }
                    result = left / right;
                    break;
                default:
                    MessageBox.Show("No valid operation found");
                    break;
            }
            op = null;
            txtDisplay.Text = result.ToString();
            start = true;
        }


        /************************************************* numbers methods ***************************************/
        private void setNum(object sender, EventArgs e)
        {
            if (((Button)sender).Text == "0" && txtDisplay.Text == "0") { return; }
            if (txtDisplay.Text == "0" || start)
            {
                txtDisplay.Text = "";
            }
            txtDisplay.Text = txtDisplay.Text + ((Button)sender).Text;
            start = false;
        }
    }
}