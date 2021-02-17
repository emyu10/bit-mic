using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;

namespace FirstTutorial
{
    public partial class Dashboard : Form
    {
        private Form adder = new Adder();
        private Form login = new Login();
        private Form addToList = new AddToList();
        private Form colors = new Colors();
        private Form calculator = new Calculator();
        private Form multiplicationTable = new MultiplicationTable();
        private Form comboExample = new ComboExample();
        private Form quiz = new Quiz();
        private Form dt = new DTExample();
        private Form age = new Age();
        private Form registration = new Registration();

        public Dashboard()
        {
            InitializeComponent();
        }

        private void Dashboard_Load(object sender, EventArgs e)
        {
            tsFormButtons.Items.Add("First Form");
            tsFormButtons.Items.Add("Login Form");
            tsFormButtons.Items.Add("ListBox Example");
            tsFormButtons.Items.Add("Colors");
            tsFormButtons.Items.Add("Calculator");
            tsFormButtons.Items.Add("Multiplication Table");
            tsFormButtons.Items.Add("Combo Example");
            tsFormButtons.Items.Add("Quiz");
            tsFormButtons.Items.Add("DT Example");
            tsFormButtons.Items.Add("Age");
            tsFormButtons.Items.Add("Registration");
            tsFormButtons.Items.Add("Arrange");
            tsFormButtons.Items.Add("Exit");
        }

        private void tsFormButtons_ItemClicked(object sender, ToolStripItemClickedEventArgs e)
        {
            string clickedItem = e.ClickedItem.Text;
            if (clickedItem == "First Form")
            {
                if (adder.IsDisposed)
                {
                    adder = new Adder();
                }
                adder.Show();
            }

            if (clickedItem == "Login Form")
            {
                if (login.IsDisposed)
                {
                    login = new Login();
                }
                login.Show();
            }

            if (clickedItem == "ListBox Example")
            {
                if (addToList.IsDisposed)
                {
                    addToList = new AddToList();
                }
                addToList.Show();
            }

            if (clickedItem == "Colors")
            {
                if (colors.IsDisposed)
                {
                    colors = new Colors();
                }
                colors.Show();
            }

            if (clickedItem == "Calculator")
            {
                if (calculator.IsDisposed)
                {
                    calculator = new Calculator();
                }
                calculator.Show();
            }

            if (clickedItem == "Multiplication Table")
            {
                if (multiplicationTable.IsDisposed)
                {
                    multiplicationTable = new MultiplicationTable();
                }
                multiplicationTable.Show();
            }

            if (clickedItem == "Combo Example")
            {
                if (comboExample.IsDisposed)
                {
                    comboExample = new ComboExample();
                }
                comboExample.Show();
            }

            if (clickedItem == "Quiz")
            {
                if (quiz.IsDisposed)
                {
                    quiz = new Quiz();
                }
                quiz.Show();
            }

            if (clickedItem == "DT Example")
            {
                if (dt.IsDisposed)
                {
                    dt = new DTExample();
                }
                dt.Show();
            }

            if (clickedItem == "Age")
            {
                if (age.IsDisposed)
                {
                    age = new Age();
                }
                age.Show();
            }

            if (clickedItem == "Registration")
            {
                if (registration.IsDisposed)
                {
                    registration = new Registration();
                }
                registration.Show();
            }

            if (clickedItem == "Arrange")
            {
                this.LayoutMdi(MdiLayout.ArrangeIcons);
            }

            if (clickedItem == "Exit")
            {
                this.Close();
            }
        }
    }
}
