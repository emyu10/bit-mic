
namespace FirstTutorial
{
    partial class Age
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
            this.dtDob = new System.Windows.Forms.DateTimePicker();
            this.label2 = new System.Windows.Forms.Label();
            this.txtYear = new System.Windows.Forms.TextBox();
            this.txtMonths = new System.Windows.Forms.TextBox();
            this.txtDays = new System.Windows.Forms.TextBox();
            this.btnCalculate = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(38, 40);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(94, 20);
            this.label1.TabIndex = 0;
            this.label1.Text = "Date of Birth";
            // 
            // dtDob
            // 
            this.dtDob.Location = new System.Drawing.Point(172, 36);
            this.dtDob.Name = "dtDob";
            this.dtDob.Size = new System.Drawing.Size(250, 27);
            this.dtDob.TabIndex = 1;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(38, 135);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(36, 20);
            this.label2.TabIndex = 2;
            this.label2.Text = "Age";
            // 
            // txtYear
            // 
            this.txtYear.Location = new System.Drawing.Point(97, 135);
            this.txtYear.Name = "txtYear";
            this.txtYear.Size = new System.Drawing.Size(125, 27);
            this.txtYear.TabIndex = 3;
            // 
            // txtMonths
            // 
            this.txtMonths.Location = new System.Drawing.Point(245, 135);
            this.txtMonths.Name = "txtMonths";
            this.txtMonths.Size = new System.Drawing.Size(125, 27);
            this.txtMonths.TabIndex = 4;
            // 
            // txtDays
            // 
            this.txtDays.Location = new System.Drawing.Point(392, 135);
            this.txtDays.Name = "txtDays";
            this.txtDays.Size = new System.Drawing.Size(125, 27);
            this.txtDays.TabIndex = 5;
            // 
            // btnCalculate
            // 
            this.btnCalculate.Location = new System.Drawing.Point(221, 88);
            this.btnCalculate.Name = "btnCalculate";
            this.btnCalculate.Size = new System.Drawing.Size(94, 29);
            this.btnCalculate.TabIndex = 6;
            this.btnCalculate.Text = "Calculate";
            this.btnCalculate.UseVisualStyleBackColor = true;
            this.btnCalculate.Click += new System.EventHandler(this.btnCalculate_Click);
            // 
            // Age
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.btnCalculate);
            this.Controls.Add(this.txtDays);
            this.Controls.Add(this.txtMonths);
            this.Controls.Add(this.txtYear);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.dtDob);
            this.Controls.Add(this.label1);
            this.Name = "Age";
            this.Text = "Age";
            this.Load += new System.EventHandler(this.Age_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.DateTimePicker dtDob;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox txtYear;
        private System.Windows.Forms.TextBox txtMonths;
        private System.Windows.Forms.TextBox txtDays;
        private System.Windows.Forms.Button btnCalculate;
    }
}