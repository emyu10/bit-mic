
namespace FirstTutorial
{
    partial class Adder
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
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
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.lblOne = new System.Windows.Forms.Label();
            this.lblTwo = new System.Windows.Forms.Label();
            this.lblResult = new System.Windows.Forms.Label();
            this.txtOne = new System.Windows.Forms.TextBox();
            this.txtTwo = new System.Windows.Forms.TextBox();
            this.txtResult = new System.Windows.Forms.TextBox();
            this.btnCalc = new System.Windows.Forms.Button();
            this.btnExit = new System.Windows.Forms.Button();
            this.lblCountries = new System.Windows.Forms.Label();
            this.lbxCountries = new System.Windows.Forms.ListBox();
            this.clbExample = new System.Windows.Forms.CheckedListBox();
            this.SuspendLayout();
            // 
            // lblOne
            // 
            this.lblOne.AutoSize = true;
            this.lblOne.Location = new System.Drawing.Point(24, 27);
            this.lblOne.Name = "lblOne";
            this.lblOne.Size = new System.Drawing.Size(132, 20);
            this.lblOne.TabIndex = 0;
            this.lblOne.Text = "Enter First Number";
            // 
            // lblTwo
            // 
            this.lblTwo.AutoSize = true;
            this.lblTwo.Location = new System.Drawing.Point(24, 64);
            this.lblTwo.Name = "lblTwo";
            this.lblTwo.Size = new System.Drawing.Size(154, 20);
            this.lblTwo.TabIndex = 1;
            this.lblTwo.Text = "Enter Second Number";
            // 
            // lblResult
            // 
            this.lblResult.AutoSize = true;
            this.lblResult.Location = new System.Drawing.Point(24, 106);
            this.lblResult.Name = "lblResult";
            this.lblResult.Size = new System.Drawing.Size(49, 20);
            this.lblResult.TabIndex = 2;
            this.lblResult.Text = "Result";
            // 
            // txtOne
            // 
            this.txtOne.Location = new System.Drawing.Point(214, 27);
            this.txtOne.Name = "txtOne";
            this.txtOne.Size = new System.Drawing.Size(125, 27);
            this.txtOne.TabIndex = 3;
            this.txtOne.Leave += new System.EventHandler(this.txtOne_Leave);
            // 
            // txtTwo
            // 
            this.txtTwo.Location = new System.Drawing.Point(214, 64);
            this.txtTwo.Name = "txtTwo";
            this.txtTwo.PasswordChar = '*';
            this.txtTwo.Size = new System.Drawing.Size(125, 27);
            this.txtTwo.TabIndex = 4;
            // 
            // txtResult
            // 
            this.txtResult.AcceptsTab = true;
            this.txtResult.Location = new System.Drawing.Point(214, 106);
            this.txtResult.Multiline = true;
            this.txtResult.Name = "txtResult";
            this.txtResult.ScrollBars = System.Windows.Forms.ScrollBars.Both;
            this.txtResult.Size = new System.Drawing.Size(125, 67);
            this.txtResult.TabIndex = 5;
            this.txtResult.TextChanged += new System.EventHandler(this.textBox1_TextChanged);
            // 
            // btnCalc
            // 
            this.btnCalc.Location = new System.Drawing.Point(24, 328);
            this.btnCalc.Name = "btnCalc";
            this.btnCalc.Size = new System.Drawing.Size(94, 29);
            this.btnCalc.TabIndex = 6;
            this.btnCalc.Text = "Calculate";
            this.btnCalc.UseVisualStyleBackColor = true;
            this.btnCalc.MouseEnter += new System.EventHandler(this.btnCalc_MouseEnter);
            this.btnCalc.MouseLeave += new System.EventHandler(this.btnCalc_MouseLeave);
            this.btnCalc.MouseHover += new System.EventHandler(this.btnCalc_MouseHover);
            // 
            // btnExit
            // 
            this.btnExit.Location = new System.Drawing.Point(244, 327);
            this.btnExit.Name = "btnExit";
            this.btnExit.Size = new System.Drawing.Size(94, 29);
            this.btnExit.TabIndex = 7;
            this.btnExit.Text = "Exit";
            this.btnExit.UseVisualStyleBackColor = true;
            this.btnExit.Click += new System.EventHandler(this.btnExit_Click);
            // 
            // lblCountries
            // 
            this.lblCountries.AutoSize = true;
            this.lblCountries.Location = new System.Drawing.Point(24, 189);
            this.lblCountries.Name = "lblCountries";
            this.lblCountries.Size = new System.Drawing.Size(71, 20);
            this.lblCountries.TabIndex = 9;
            this.lblCountries.Text = "Countries";
            // 
            // lbxCountries
            // 
            this.lbxCountries.FormattingEnabled = true;
            this.lbxCountries.ItemHeight = 20;
            this.lbxCountries.Location = new System.Drawing.Point(189, 189);
            this.lbxCountries.Name = "lbxCountries";
            this.lbxCountries.Size = new System.Drawing.Size(150, 104);
            this.lbxCountries.Sorted = true;
            this.lbxCountries.TabIndex = 10;
            // 
            // clbExample
            // 
            this.clbExample.CheckOnClick = true;
            this.clbExample.FormattingEnabled = true;
            this.clbExample.Location = new System.Drawing.Point(392, 59);
            this.clbExample.Name = "clbExample";
            this.clbExample.Size = new System.Drawing.Size(150, 114);
            this.clbExample.TabIndex = 11;
            // 
            // Adder
            // 
            this.AcceptButton = this.btnCalc;
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.CancelButton = this.btnExit;
            this.ClientSize = new System.Drawing.Size(744, 378);
            this.Controls.Add(this.clbExample);
            this.Controls.Add(this.lbxCountries);
            this.Controls.Add(this.lblCountries);
            this.Controls.Add(this.btnExit);
            this.Controls.Add(this.btnCalc);
            this.Controls.Add(this.txtResult);
            this.Controls.Add(this.txtTwo);
            this.Controls.Add(this.txtOne);
            this.Controls.Add(this.lblResult);
            this.Controls.Add(this.lblTwo);
            this.Controls.Add(this.lblOne);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.MaximizeBox = false;
            this.Name = "Adder";
            this.SizeGripStyle = System.Windows.Forms.SizeGripStyle.Hide;
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Adder";
            this.Load += new System.EventHandler(this.Adder_Load);
            this.Click += new System.EventHandler(this.Adder_Click);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lblOne;
        private System.Windows.Forms.Label lblTwo;
        private System.Windows.Forms.Label lblResult;
        private System.Windows.Forms.TextBox txtOne;
        private System.Windows.Forms.TextBox txtTwo;
        private System.Windows.Forms.TextBox txtResult;
        private System.Windows.Forms.Button btnCalc;
        private System.Windows.Forms.Button btnExit;
        private System.Windows.Forms.Label lblCountries;
        private System.Windows.Forms.ListBox lbxCountries;
        private System.Windows.Forms.CheckedListBox clbExample;
    }
}

