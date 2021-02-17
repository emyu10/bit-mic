
namespace FirstTutorial
{
    partial class Registration
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.txtName = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.txtAge = new System.Windows.Forms.TextBox();
            this.dtpDob = new System.Windows.Forms.DateTimePicker();
            this.label3 = new System.Windows.Forms.Label();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.rbGenderFemale = new System.Windows.Forms.RadioButton();
            this.rbGenderMale = new System.Windows.Forms.RadioButton();
            this.label4 = new System.Windows.Forms.Label();
            this.cbxCourse = new System.Windows.Forms.ComboBox();
            this.btnAdd = new System.Windows.Forms.Button();
            this.btnExit = new System.Windows.Forms.Button();
            this.lbxStudents = new System.Windows.Forms.ListBox();
            this.groupBox1.SuspendLayout();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(12, 9);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(104, 20);
            this.label1.TabIndex = 0;
            this.label1.Text = "Student Name";
            // 
            // txtName
            // 
            this.txtName.Location = new System.Drawing.Point(125, 9);
            this.txtName.Name = "txtName";
            this.txtName.Size = new System.Drawing.Size(250, 27);
            this.txtName.TabIndex = 1;
            this.txtName.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.txtName_KeyPress);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(13, 57);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(94, 20);
            this.label2.TabIndex = 2;
            this.label2.Text = "Date of Birth";
            // 
            // txtAge
            // 
            this.txtAge.Enabled = false;
            this.txtAge.Location = new System.Drawing.Point(125, 93);
            this.txtAge.Name = "txtAge";
            this.txtAge.Size = new System.Drawing.Size(250, 27);
            this.txtAge.TabIndex = 3;
            // 
            // dtpDob
            // 
            this.dtpDob.Location = new System.Drawing.Point(125, 50);
            this.dtpDob.MaxDate = new System.DateTime(2021, 1, 28, 0, 0, 0, 0);
            this.dtpDob.Name = "dtpDob";
            this.dtpDob.Size = new System.Drawing.Size(250, 27);
            this.dtpDob.TabIndex = 4;
            this.dtpDob.Value = new System.DateTime(2021, 1, 28, 0, 0, 0, 0);
            this.dtpDob.ValueChanged += new System.EventHandler(this.dtpDob_ValueChanged);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(13, 96);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(36, 20);
            this.label3.TabIndex = 5;
            this.label3.Text = "Age";
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.rbGenderFemale);
            this.groupBox1.Controls.Add(this.rbGenderMale);
            this.groupBox1.Location = new System.Drawing.Point(13, 126);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(362, 66);
            this.groupBox1.TabIndex = 6;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Gender";
            // 
            // rbGenderFemale
            // 
            this.rbGenderFemale.AutoSize = true;
            this.rbGenderFemale.Location = new System.Drawing.Point(225, 26);
            this.rbGenderFemale.Name = "rbGenderFemale";
            this.rbGenderFemale.Size = new System.Drawing.Size(78, 24);
            this.rbGenderFemale.TabIndex = 1;
            this.rbGenderFemale.TabStop = true;
            this.rbGenderFemale.Text = "Female";
            this.rbGenderFemale.UseVisualStyleBackColor = true;
            this.rbGenderFemale.CheckedChanged += new System.EventHandler(this.genderCheckChange);
            // 
            // rbGenderMale
            // 
            this.rbGenderMale.AutoSize = true;
            this.rbGenderMale.Location = new System.Drawing.Point(24, 27);
            this.rbGenderMale.Name = "rbGenderMale";
            this.rbGenderMale.Size = new System.Drawing.Size(63, 24);
            this.rbGenderMale.TabIndex = 0;
            this.rbGenderMale.TabStop = true;
            this.rbGenderMale.Text = "Male";
            this.rbGenderMale.UseVisualStyleBackColor = true;
            this.rbGenderMale.CheckedChanged += new System.EventHandler(this.genderCheckChange);
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(13, 208);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(54, 20);
            this.label4.TabIndex = 7;
            this.label4.Text = "Course";
            // 
            // cbxCourse
            // 
            this.cbxCourse.FormattingEnabled = true;
            this.cbxCourse.Location = new System.Drawing.Point(125, 205);
            this.cbxCourse.Name = "cbxCourse";
            this.cbxCourse.Size = new System.Drawing.Size(250, 28);
            this.cbxCourse.TabIndex = 8;
            // 
            // btnAdd
            // 
            this.btnAdd.Location = new System.Drawing.Point(13, 349);
            this.btnAdd.Name = "btnAdd";
            this.btnAdd.Size = new System.Drawing.Size(94, 29);
            this.btnAdd.TabIndex = 9;
            this.btnAdd.Text = "Add";
            this.btnAdd.UseVisualStyleBackColor = true;
            this.btnAdd.Click += new System.EventHandler(this.btnAdd_Click);
            // 
            // btnExit
            // 
            this.btnExit.Location = new System.Drawing.Point(280, 349);
            this.btnExit.Name = "btnExit";
            this.btnExit.Size = new System.Drawing.Size(94, 29);
            this.btnExit.TabIndex = 10;
            this.btnExit.Text = "Exit";
            this.btnExit.UseVisualStyleBackColor = true;
            this.btnExit.Click += new System.EventHandler(this.btnExit_Click);
            // 
            // lbxStudents
            // 
            this.lbxStudents.FormattingEnabled = true;
            this.lbxStudents.ItemHeight = 20;
            this.lbxStudents.Location = new System.Drawing.Point(404, 16);
            this.lbxStudents.Name = "lbxStudents";
            this.lbxStudents.Size = new System.Drawing.Size(355, 424);
            this.lbxStudents.TabIndex = 11;
            // 
            // Registration
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(770, 450);
            this.Controls.Add(this.lbxStudents);
            this.Controls.Add(this.btnExit);
            this.Controls.Add(this.btnAdd);
            this.Controls.Add(this.cbxCourse);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.groupBox1);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.dtpDob);
            this.Controls.Add(this.txtAge);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.txtName);
            this.Controls.Add(this.label1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.Fixed3D;
            this.MaximizeBox = false;
            this.Name = "Registration";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Registration";
            this.Load += new System.EventHandler(this.Registration_Load);
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox txtName;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox txtAge;
        private System.Windows.Forms.DateTimePicker dtpDob;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.RadioButton rbGenderFemale;
        private System.Windows.Forms.RadioButton rbGenderMale;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.ComboBox cbxCourse;
        private System.Windows.Forms.Button btnAdd;
        private System.Windows.Forms.Button btnExit;
        private System.Windows.Forms.ListBox lbxStudents;
    }
}