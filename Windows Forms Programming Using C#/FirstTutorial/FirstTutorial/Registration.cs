using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;

namespace FirstTutorial
{
    struct Duration
    {
        public int years;
        public int months;
        public int days;
    }

    public partial class Registration : Form
    {
        private string[] courses =
        {
            "Unix Sockets",
            "Apex",
            "Arduino",
            "Assembly",
            "Awk",
            "C Standard Library",
            "Clojure",
            "COBOL",
            "C",
            "C++",
            "C++ Standard Library",
            "C#",
            "Dart",
            "D",
            "Elixir",
            "Elm",
            "Erlang",
            "Euphoria",
            "Fortran",
            "F#",
            "Go Programing",
            "Groovy",
            "Haskell",
            "Java",
            "Java-8",
            "Java Bean Utils",
            "JCL",
            "KDB+",
            "LISP",
            "LOLCODE",
            "LOGO",
            "MATLAB",
            "Node.js",
            "Objective C",
            "OAuth2.0",
            "Pascal",
            "Parrot",
            "CGI with PERL",
            "Prolog",
            "R Programming",
            "Rexx Programming",
            "Rust Programming",
            "Scala",
            "Scala Collection",
            "Socket.io",
            "Solidity",
            "Swift",
            "VB.Net",
            "VBA",
            "WebAssembly"
        };

        private string studentName = "";
        private DateTime dob = DateTime.Now;
        private Duration age = new Duration();
        private string gender = "";
        private string course = "";
        private bool valid = true;

        public Registration()
        {
            InitializeComponent();
        }

        private void Registration_Load(object sender, EventArgs e)
        {
            this.MdiParent = Dashboard.ActiveForm;
            dtpDob.MaxDate = DateTime.Now;
            cbxCourse.Items.AddRange(this.courses);
            cbxCourse.AutoCompleteMode = AutoCompleteMode.SuggestAppend;
            calculateAge(this.dob);
        }

        private void txtName_KeyPress(object sender, KeyPressEventArgs e)
        {
            bool allowed = char.IsLetter(e.KeyChar) || e.KeyChar == '.' || e.KeyChar == (char)Keys.Back || e.KeyChar == (char)Keys.Space;
            if (!allowed)
            {
                e.Handled = true;
            }
        }

        private string calculateAge(DateTime dob)
        {
            DateTime currentDate = DateTime.Now;
            TimeSpan age = currentDate.Subtract(dob);
            double days = age.TotalDays;
            int years = (int)(days / 365.25);
            int remDays = (int)(days - (years * 365.25));//(int) days % 365;
            int months = 0;
            if (remDays > 30)
            {
                months = remDays / 30;
                remDays = remDays % 30;
            }

            this.age.years = years;
            this.age.months = months;
            this.age.days = remDays;

            return years.ToString() + " years, " + months.ToString() + " months, " + remDays.ToString() + " days";
        }

        private void dtpDob_ValueChanged(object sender, EventArgs e)
        {
            txtAge.Text = calculateAge(dtpDob.Value);
        }

        private void validateAge()
        {
            //MessageBox.Show(this.age.years.ToString());
            if (this.age.years < 13 || this.age.years >= 21)
            {
                MessageBox.Show("Student must be above 13 years and below 21 years.");
                valid = false;
            }
        }

        private void validateName()
        {
            if (txtName.TextLength == 0)
            {
                MessageBox.Show("Student name cannot be nothing.");
                txtName.Focus();
                valid = false;
            }
        }

        private void validateGender()
        {
            if (this.gender == "")
            {
                MessageBox.Show("Please select a gender.");
                valid = false;
            }
        }

        private void validateCourse()
        {
            if (this.course == "")
            {
                MessageBox.Show("Please select a course to enroll.");
                valid = false;
            }
        }

        private void btnExit_Click(object sender, EventArgs e)
        {
            this.Hide();
        }

        private void btnAdd_Click(object sender, EventArgs e)
        {
            valid = true;
            studentName = txtName.Text;
            course = cbxCourse.SelectedItem == null ? "": cbxCourse.SelectedItem.ToString();
            validateName();
            if (!valid) { return;  }
            validateAge();
            if (!valid) { return; }
            validateGender();
            if (!valid) { return; }
            validateCourse();
            if (!valid) { return; }
            //MessageBox.Show(
            //    "Name: " + studentName + "\n" +
            //    "DOB: " + dob.ToString() + "\n" +
            //    "Age: " + txtAge.Text + "\n" +
            //    "Gender: " + gender + "\n" +
            //    "Course: " + course + "\n"
            //    );
            string studentInfo = studentName + " (" + gender + ") | " + dob.ToString("d/M/yyyy") + " | " + course;
            lbxStudents.Items.Add(studentInfo);
        }

        private void genderCheckChange(object sender, EventArgs e)
        {
            RadioButton rb = (RadioButton)sender;
            if (rb.Checked)
            {
                this.gender = rb.Text;
            }
        }
    }
}
