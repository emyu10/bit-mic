
namespace Assignment
{
    partial class Form1
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
            this.lblName = new System.Windows.Forms.Label();
            this.txtName = new System.Windows.Forms.TextBox();
            this.days = new System.Windows.Forms.ComboBox();
            this.lbNames = new System.Windows.Forms.ListBox();
            this.gbxGender = new System.Windows.Forms.GroupBox();
            this.rdbMale = new System.Windows.Forms.RadioButton();
            this.rdbFemale = new System.Windows.Forms.RadioButton();
            this.checkEditable = new System.Windows.Forms.CheckBox();
            this.checkHide = new System.Windows.Forms.CheckBox();
            this.gbxGender.SuspendLayout();
            this.SuspendLayout();
            // 
            // lblName
            // 
            this.lblName.AutoSize = true;
            this.lblName.Location = new System.Drawing.Point(12, 24);
            this.lblName.Name = "lblName";
            this.lblName.Size = new System.Drawing.Size(35, 13);
            this.lblName.TabIndex = 0;
            this.lblName.Text = "label1";
            this.lblName.Click += new System.EventHandler(this.lblName_Click);
            // 
            // txtName
            // 
            this.txtName.Location = new System.Drawing.Point(83, 24);
            this.txtName.Name = "txtName";
            this.txtName.Size = new System.Drawing.Size(100, 20);
            this.txtName.TabIndex = 1;
            // 
            // days
            // 
            this.days.FormattingEnabled = true;
            this.days.Location = new System.Drawing.Point(215, 21);
            this.days.Name = "days";
            this.days.Size = new System.Drawing.Size(121, 21);
            this.days.TabIndex = 2;
            this.days.SelectedIndexChanged += new System.EventHandler(this.days_SelectedIndexChanged);
            // 
            // lbNames
            // 
            this.lbNames.FormattingEnabled = true;
            this.lbNames.Location = new System.Drawing.Point(382, 21);
            this.lbNames.Name = "lbNames";
            this.lbNames.Size = new System.Drawing.Size(120, 95);
            this.lbNames.TabIndex = 3;
            this.lbNames.Leave += new System.EventHandler(this.lbNames_Leave);
            // 
            // gbxGender
            // 
            this.gbxGender.Controls.Add(this.rdbFemale);
            this.gbxGender.Controls.Add(this.rdbMale);
            this.gbxGender.Location = new System.Drawing.Point(111, 186);
            this.gbxGender.Name = "gbxGender";
            this.gbxGender.Size = new System.Drawing.Size(178, 71);
            this.gbxGender.TabIndex = 4;
            this.gbxGender.TabStop = false;
            this.gbxGender.Text = "Gender";
            this.gbxGender.ControlAdded += new System.Windows.Forms.ControlEventHandler(this.gbxGender_ControlAdded);
            // 
            // rdbMale
            // 
            this.rdbMale.AutoSize = true;
            this.rdbMale.Location = new System.Drawing.Point(16, 30);
            this.rdbMale.Name = "rdbMale";
            this.rdbMale.Size = new System.Drawing.Size(48, 17);
            this.rdbMale.TabIndex = 0;
            this.rdbMale.TabStop = true;
            this.rdbMale.Text = "Male";
            this.rdbMale.UseVisualStyleBackColor = true;
            this.rdbMale.CheckedChanged += new System.EventHandler(this.rdbMale_CheckedChanged);
            // 
            // rdbFemale
            // 
            this.rdbFemale.AutoSize = true;
            this.rdbFemale.Location = new System.Drawing.Point(104, 30);
            this.rdbFemale.Name = "rdbFemale";
            this.rdbFemale.Size = new System.Drawing.Size(59, 17);
            this.rdbFemale.TabIndex = 1;
            this.rdbFemale.TabStop = true;
            this.rdbFemale.Text = "Female";
            this.rdbFemale.UseVisualStyleBackColor = true;
            // 
            // checkEditable
            // 
            this.checkEditable.AutoSize = true;
            this.checkEditable.Location = new System.Drawing.Point(563, 186);
            this.checkEditable.Name = "checkEditable";
            this.checkEditable.Size = new System.Drawing.Size(64, 17);
            this.checkEditable.TabIndex = 5;
            this.checkEditable.Text = "Editable";
            this.checkEditable.UseVisualStyleBackColor = true;
            // 
            // checkHide
            // 
            this.checkHide.AutoSize = true;
            this.checkHide.Location = new System.Drawing.Point(434, 319);
            this.checkHide.Name = "checkHide";
            this.checkHide.Size = new System.Drawing.Size(66, 17);
            this.checkHide.TabIndex = 6;
            this.checkHide.Text = "Hide Me";
            this.checkHide.UseVisualStyleBackColor = true;
            this.checkHide.AppearanceChanged += new System.EventHandler(this.checkHide_AppearanceChanged);
            this.checkHide.CheckedChanged += new System.EventHandler(this.checkHide_CheckedChanged);
            this.checkHide.CheckStateChanged += new System.EventHandler(this.checkHide_CheckStateChanged);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.checkHide);
            this.Controls.Add(this.checkEditable);
            this.Controls.Add(this.gbxGender);
            this.Controls.Add(this.lbNames);
            this.Controls.Add(this.days);
            this.Controls.Add(this.txtName);
            this.Controls.Add(this.lblName);
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.gbxGender.ResumeLayout(false);
            this.gbxGender.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lblName;
        private System.Windows.Forms.TextBox txtName;
        private System.Windows.Forms.ComboBox days;
        private System.Windows.Forms.ListBox lbNames;
        private System.Windows.Forms.GroupBox gbxGender;
        private System.Windows.Forms.RadioButton rdbFemale;
        private System.Windows.Forms.RadioButton rdbMale;
        private System.Windows.Forms.CheckBox checkEditable;
        private System.Windows.Forms.CheckBox checkHide;
    }
}

