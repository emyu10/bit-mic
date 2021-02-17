
namespace FirstTutorial
{
    partial class Quiz
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
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.qOneSolih = new System.Windows.Forms.RadioButton();
            this.qOneNasreena = new System.Windows.Forms.RadioButton();
            this.qOneMaumoon = new System.Windows.Forms.RadioButton();
            this.groupBox2 = new System.Windows.Forms.GroupBox();
            this.qTwo4 = new System.Windows.Forms.RadioButton();
            this.qTwo2 = new System.Windows.Forms.RadioButton();
            this.qTwo3 = new System.Windows.Forms.RadioButton();
            this.groupBox3 = new System.Windows.Forms.GroupBox();
            this.qThreeMarkup = new System.Windows.Forms.RadioButton();
            this.qThreeProgramming = new System.Windows.Forms.RadioButton();
            this.btnSubmit = new System.Windows.Forms.Button();
            this.groupBox1.SuspendLayout();
            this.groupBox2.SuspendLayout();
            this.groupBox3.SuspendLayout();
            this.SuspendLayout();
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.qOneSolih);
            this.groupBox1.Controls.Add(this.qOneNasreena);
            this.groupBox1.Controls.Add(this.qOneMaumoon);
            this.groupBox1.Location = new System.Drawing.Point(13, 13);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(611, 87);
            this.groupBox1.TabIndex = 0;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Who is the president of Maldives?";
            // 
            // qOneSolih
            // 
            this.qOneSolih.AutoSize = true;
            this.qOneSolih.Location = new System.Drawing.Point(383, 41);
            this.qOneSolih.Name = "qOneSolih";
            this.qOneSolih.Size = new System.Drawing.Size(190, 24);
            this.qOneSolih.TabIndex = 2;
            this.qOneSolih.TabStop = true;
            this.qOneSolih.Text = "Ibrahim Mohamed Solih";
            this.qOneSolih.UseVisualStyleBackColor = true;
            this.qOneSolih.CheckedChanged += new System.EventHandler(this.qOneMaumoon_CheckedChanged);
            // 
            // qOneNasreena
            // 
            this.qOneNasreena.AutoSize = true;
            this.qOneNasreena.Location = new System.Drawing.Point(230, 41);
            this.qOneNasreena.Name = "qOneNasreena";
            this.qOneNasreena.Size = new System.Drawing.Size(147, 24);
            this.qOneNasreena.TabIndex = 1;
            this.qOneNasreena.TabStop = true;
            this.qOneNasreena.Text = "Nasreena Ibrahim";
            this.qOneNasreena.UseVisualStyleBackColor = true;
            this.qOneNasreena.CheckedChanged += new System.EventHandler(this.qOneMaumoon_CheckedChanged);
            // 
            // qOneMaumoon
            // 
            this.qOneMaumoon.AutoSize = true;
            this.qOneMaumoon.Location = new System.Drawing.Point(15, 41);
            this.qOneMaumoon.Name = "qOneMaumoon";
            this.qOneMaumoon.Size = new System.Drawing.Size(209, 24);
            this.qOneMaumoon.TabIndex = 0;
            this.qOneMaumoon.TabStop = true;
            this.qOneMaumoon.Text = "Maumoon Abdul Gayyoom";
            this.qOneMaumoon.UseVisualStyleBackColor = true;
            this.qOneMaumoon.CheckedChanged += new System.EventHandler(this.qOneMaumoon_CheckedChanged);
            // 
            // groupBox2
            // 
            this.groupBox2.Controls.Add(this.qTwo4);
            this.groupBox2.Controls.Add(this.qTwo2);
            this.groupBox2.Controls.Add(this.qTwo3);
            this.groupBox2.Location = new System.Drawing.Point(13, 106);
            this.groupBox2.Name = "groupBox2";
            this.groupBox2.Size = new System.Drawing.Size(611, 75);
            this.groupBox2.TabIndex = 1;
            this.groupBox2.TabStop = false;
            this.groupBox2.Text = "How many monsoons are there in Maldives?";
            // 
            // qTwo4
            // 
            this.qTwo4.AutoSize = true;
            this.qTwo4.Location = new System.Drawing.Point(105, 38);
            this.qTwo4.Name = "qTwo4";
            this.qTwo4.Size = new System.Drawing.Size(38, 24);
            this.qTwo4.TabIndex = 2;
            this.qTwo4.TabStop = true;
            this.qTwo4.Text = "4";
            this.qTwo4.UseVisualStyleBackColor = true;
            this.qTwo4.CheckedChanged += new System.EventHandler(this.qTwo3_CheckedChanged);
            // 
            // qTwo2
            // 
            this.qTwo2.AutoSize = true;
            this.qTwo2.Location = new System.Drawing.Point(60, 38);
            this.qTwo2.Name = "qTwo2";
            this.qTwo2.Size = new System.Drawing.Size(38, 24);
            this.qTwo2.TabIndex = 1;
            this.qTwo2.TabStop = true;
            this.qTwo2.Text = "2";
            this.qTwo2.UseVisualStyleBackColor = true;
            this.qTwo2.CheckedChanged += new System.EventHandler(this.qTwo3_CheckedChanged);
            // 
            // qTwo3
            // 
            this.qTwo3.AutoSize = true;
            this.qTwo3.Location = new System.Drawing.Point(15, 38);
            this.qTwo3.Name = "qTwo3";
            this.qTwo3.Size = new System.Drawing.Size(38, 24);
            this.qTwo3.TabIndex = 0;
            this.qTwo3.TabStop = true;
            this.qTwo3.Text = "3";
            this.qTwo3.UseVisualStyleBackColor = true;
            this.qTwo3.CheckedChanged += new System.EventHandler(this.qTwo3_CheckedChanged);
            // 
            // groupBox3
            // 
            this.groupBox3.Controls.Add(this.qThreeMarkup);
            this.groupBox3.Controls.Add(this.qThreeProgramming);
            this.groupBox3.Location = new System.Drawing.Point(13, 187);
            this.groupBox3.Name = "groupBox3";
            this.groupBox3.Size = new System.Drawing.Size(611, 88);
            this.groupBox3.TabIndex = 2;
            this.groupBox3.TabStop = false;
            this.groupBox3.Text = "C# is a .....";
            // 
            // qThreeMarkup
            // 
            this.qThreeMarkup.AutoSize = true;
            this.qThreeMarkup.Location = new System.Drawing.Point(230, 47);
            this.qThreeMarkup.Name = "qThreeMarkup";
            this.qThreeMarkup.Size = new System.Drawing.Size(149, 24);
            this.qThreeMarkup.TabIndex = 1;
            this.qThreeMarkup.TabStop = true;
            this.qThreeMarkup.Text = "Markup Language";
            this.qThreeMarkup.UseVisualStyleBackColor = true;
            // 
            // qThreeProgramming
            // 
            this.qThreeProgramming.AutoSize = true;
            this.qThreeProgramming.Location = new System.Drawing.Point(7, 47);
            this.qThreeProgramming.Name = "qThreeProgramming";
            this.qThreeProgramming.Size = new System.Drawing.Size(190, 24);
            this.qThreeProgramming.TabIndex = 0;
            this.qThreeProgramming.TabStop = true;
            this.qThreeProgramming.Text = "Programming Language";
            this.qThreeProgramming.UseVisualStyleBackColor = true;
            this.qThreeProgramming.CheckedChanged += new System.EventHandler(this.qThreeProgramming_CheckedChanged);
            // 
            // btnSubmit
            // 
            this.btnSubmit.Location = new System.Drawing.Point(13, 317);
            this.btnSubmit.Name = "btnSubmit";
            this.btnSubmit.Size = new System.Drawing.Size(94, 29);
            this.btnSubmit.TabIndex = 3;
            this.btnSubmit.Text = "Submit";
            this.btnSubmit.UseVisualStyleBackColor = true;
            this.btnSubmit.Click += new System.EventHandler(this.btnSubmit_Click);
            // 
            // Quiz
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(653, 450);
            this.Controls.Add(this.btnSubmit);
            this.Controls.Add(this.groupBox3);
            this.Controls.Add(this.groupBox2);
            this.Controls.Add(this.groupBox1);
            this.Name = "Quiz";
            this.Text = "Quiz";
            this.Load += new System.EventHandler(this.Quiz_Load);
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.groupBox2.ResumeLayout(false);
            this.groupBox2.PerformLayout();
            this.groupBox3.ResumeLayout(false);
            this.groupBox3.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.RadioButton qOneSolih;
        private System.Windows.Forms.RadioButton qOneNasreena;
        private System.Windows.Forms.RadioButton qOneMaumoon;
        private System.Windows.Forms.GroupBox groupBox2;
        private System.Windows.Forms.RadioButton qTwo4;
        private System.Windows.Forms.RadioButton qTwo2;
        private System.Windows.Forms.RadioButton qTwo3;
        private System.Windows.Forms.GroupBox groupBox3;
        private System.Windows.Forms.RadioButton qThreeMarkup;
        private System.Windows.Forms.RadioButton qThreeProgramming;
        private System.Windows.Forms.Button btnSubmit;
    }
}