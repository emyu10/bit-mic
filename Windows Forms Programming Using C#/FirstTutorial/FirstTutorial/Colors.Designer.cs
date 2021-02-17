
namespace FirstTutorial
{
    partial class Colors
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
            this.panelDisplay = new System.Windows.Forms.Panel();
            this.spinRed = new System.Windows.Forms.NumericUpDown();
            this.spinGreen = new System.Windows.Forms.NumericUpDown();
            this.spinBlue = new System.Windows.Forms.NumericUpDown();
            this.btnExit = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            ((System.ComponentModel.ISupportInitialize)(this.spinRed)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.spinGreen)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.spinBlue)).BeginInit();
            this.SuspendLayout();
            // 
            // panelDisplay
            // 
            this.panelDisplay.Location = new System.Drawing.Point(12, 12);
            this.panelDisplay.Name = "panelDisplay";
            this.panelDisplay.Size = new System.Drawing.Size(532, 157);
            this.panelDisplay.TabIndex = 0;
            // 
            // spinRed
            // 
            this.spinRed.Location = new System.Drawing.Point(12, 213);
            this.spinRed.Maximum = new decimal(new int[] {
            255,
            0,
            0,
            0});
            this.spinRed.Name = "spinRed";
            this.spinRed.Size = new System.Drawing.Size(150, 27);
            this.spinRed.TabIndex = 1;
            this.spinRed.ValueChanged += new System.EventHandler(this.spinnerValueChanged);
            // 
            // spinGreen
            // 
            this.spinGreen.Location = new System.Drawing.Point(198, 213);
            this.spinGreen.Maximum = new decimal(new int[] {
            255,
            0,
            0,
            0});
            this.spinGreen.Name = "spinGreen";
            this.spinGreen.Size = new System.Drawing.Size(150, 27);
            this.spinGreen.TabIndex = 2;
            this.spinGreen.ValueChanged += new System.EventHandler(this.spinnerValueChanged);
            // 
            // spinBlue
            // 
            this.spinBlue.Location = new System.Drawing.Point(393, 213);
            this.spinBlue.Maximum = new decimal(new int[] {
            255,
            0,
            0,
            0});
            this.spinBlue.Name = "spinBlue";
            this.spinBlue.Size = new System.Drawing.Size(150, 27);
            this.spinBlue.TabIndex = 3;
            this.spinBlue.ValueChanged += new System.EventHandler(this.spinnerValueChanged);
            // 
            // btnExit
            // 
            this.btnExit.Location = new System.Drawing.Point(12, 263);
            this.btnExit.Name = "btnExit";
            this.btnExit.Size = new System.Drawing.Size(531, 29);
            this.btnExit.TabIndex = 5;
            this.btnExit.Text = "Exit";
            this.btnExit.UseVisualStyleBackColor = true;
            this.btnExit.Click += new System.EventHandler(this.btnExit_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.ForeColor = System.Drawing.Color.Red;
            this.label1.Location = new System.Drawing.Point(12, 190);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(35, 20);
            this.label1.TabIndex = 6;
            this.label1.Text = "Red";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.ForeColor = System.Drawing.Color.Green;
            this.label2.Location = new System.Drawing.Point(198, 190);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(48, 20);
            this.label2.TabIndex = 7;
            this.label2.Text = "Green";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.ForeColor = System.Drawing.Color.Blue;
            this.label3.Location = new System.Drawing.Point(393, 190);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(38, 20);
            this.label3.TabIndex = 8;
            this.label3.Text = "Blue";
            // 
            // Colors
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(555, 307);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.btnExit);
            this.Controls.Add(this.spinBlue);
            this.Controls.Add(this.spinGreen);
            this.Controls.Add(this.spinRed);
            this.Controls.Add(this.panelDisplay);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.MaximizeBox = false;
            this.Name = "Colors";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Colors";
            this.Load += new System.EventHandler(this.Colors_Load);
            ((System.ComponentModel.ISupportInitialize)(this.spinRed)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.spinGreen)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.spinBlue)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Panel panelDisplay;
        private System.Windows.Forms.NumericUpDown spinRed;
        private System.Windows.Forms.NumericUpDown spinGreen;
        private System.Windows.Forms.NumericUpDown spinBlue;
        private System.Windows.Forms.Button btnExit;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
    }
}