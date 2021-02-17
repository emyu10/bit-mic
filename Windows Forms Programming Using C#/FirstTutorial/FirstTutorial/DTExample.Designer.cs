
namespace FirstTutorial
{
    partial class DTExample
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
            this.dtOne = new System.Windows.Forms.DateTimePicker();
            this.btnFormat = new System.Windows.Forms.Button();
            this.txtShowDate = new System.Windows.Forms.TextBox();
            this.btnTwo = new System.Windows.Forms.Button();
            this.dtStart = new System.Windows.Forms.DateTimePicker();
            this.dtEnd = new System.Windows.Forms.DateTimePicker();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.btnDifference = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // dtOne
            // 
            this.dtOne.Location = new System.Drawing.Point(272, 59);
            this.dtOne.Name = "dtOne";
            this.dtOne.Size = new System.Drawing.Size(250, 27);
            this.dtOne.TabIndex = 0;
            // 
            // btnFormat
            // 
            this.btnFormat.Location = new System.Drawing.Point(157, 57);
            this.btnFormat.Name = "btnFormat";
            this.btnFormat.Size = new System.Drawing.Size(94, 29);
            this.btnFormat.TabIndex = 1;
            this.btnFormat.Text = "Format";
            this.btnFormat.UseVisualStyleBackColor = true;
            this.btnFormat.Click += new System.EventHandler(this.btnFormat_Click);
            // 
            // txtShowDate
            // 
            this.txtShowDate.Location = new System.Drawing.Point(272, 128);
            this.txtShowDate.Name = "txtShowDate";
            this.txtShowDate.Size = new System.Drawing.Size(125, 27);
            this.txtShowDate.TabIndex = 2;
            // 
            // btnTwo
            // 
            this.btnTwo.Location = new System.Drawing.Point(427, 125);
            this.btnTwo.Name = "btnTwo";
            this.btnTwo.Size = new System.Drawing.Size(94, 29);
            this.btnTwo.TabIndex = 3;
            this.btnTwo.Text = "Show";
            this.btnTwo.UseVisualStyleBackColor = true;
            this.btnTwo.Click += new System.EventHandler(this.btnTwo_Click);
            // 
            // dtStart
            // 
            this.dtStart.Location = new System.Drawing.Point(272, 230);
            this.dtStart.Name = "dtStart";
            this.dtStart.Size = new System.Drawing.Size(250, 27);
            this.dtStart.TabIndex = 4;
            // 
            // dtEnd
            // 
            this.dtEnd.Location = new System.Drawing.Point(272, 277);
            this.dtEnd.Name = "dtEnd";
            this.dtEnd.Size = new System.Drawing.Size(250, 27);
            this.dtEnd.TabIndex = 5;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(214, 230);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(40, 20);
            this.label1.TabIndex = 6;
            this.label1.Text = "Start";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(214, 277);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(34, 20);
            this.label2.TabIndex = 7;
            this.label2.Text = "End";
            // 
            // btnDifference
            // 
            this.btnDifference.Location = new System.Drawing.Point(426, 330);
            this.btnDifference.Name = "btnDifference";
            this.btnDifference.Size = new System.Drawing.Size(94, 29);
            this.btnDifference.TabIndex = 8;
            this.btnDifference.Text = "Difference";
            this.btnDifference.UseVisualStyleBackColor = true;
            this.btnDifference.Click += new System.EventHandler(this.btnDifference_Click);
            // 
            // DTExample
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.btnDifference);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.dtEnd);
            this.Controls.Add(this.dtStart);
            this.Controls.Add(this.btnTwo);
            this.Controls.Add(this.txtShowDate);
            this.Controls.Add(this.btnFormat);
            this.Controls.Add(this.dtOne);
            this.Name = "DTExample";
            this.Text = "DTExample";
            this.Load += new System.EventHandler(this.DTExample_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.DateTimePicker dtOne;
        private System.Windows.Forms.Button btnFormat;
        private System.Windows.Forms.TextBox txtShowDate;
        private System.Windows.Forms.Button btnTwo;
        private System.Windows.Forms.DateTimePicker dtStart;
        private System.Windows.Forms.DateTimePicker dtEnd;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Button btnDifference;
    }
}