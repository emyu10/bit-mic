
namespace FirstTutorial
{
    partial class ComboExample
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
            this.cmbOne = new System.Windows.Forms.ComboBox();
            this.txtAlpha = new System.Windows.Forms.TextBox();
            this.txtNums = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // cmbOne
            // 
            this.cmbOne.AutoCompleteCustomSource.AddRange(new string[] {
            "S",
            "M",
            "T",
            "w",
            "T"});
            this.cmbOne.AutoCompleteMode = System.Windows.Forms.AutoCompleteMode.Append;
            this.cmbOne.AutoCompleteSource = System.Windows.Forms.AutoCompleteSource.ListItems;
            this.cmbOne.FormattingEnabled = true;
            this.cmbOne.Location = new System.Drawing.Point(234, 95);
            this.cmbOne.Name = "cmbOne";
            this.cmbOne.Size = new System.Drawing.Size(151, 28);
            this.cmbOne.TabIndex = 0;
            // 
            // txtAlpha
            // 
            this.txtAlpha.Location = new System.Drawing.Point(139, 238);
            this.txtAlpha.Name = "txtAlpha";
            this.txtAlpha.Size = new System.Drawing.Size(125, 27);
            this.txtAlpha.TabIndex = 1;
            this.txtAlpha.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.txtAlpha_KeyPress);
            // 
            // txtNums
            // 
            this.txtNums.Location = new System.Drawing.Point(393, 238);
            this.txtNums.Name = "txtNums";
            this.txtNums.Size = new System.Drawing.Size(125, 27);
            this.txtNums.TabIndex = 2;
            this.txtNums.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.txtNums_KeyPress);
            // 
            // ComboExample
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.txtNums);
            this.Controls.Add(this.txtAlpha);
            this.Controls.Add(this.cmbOne);
            this.Name = "ComboExample";
            this.Text = "ComboExample";
            this.Load += new System.EventHandler(this.ComboExample_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ComboBox cmbOne;
        private System.Windows.Forms.TextBox txtAlpha;
        private System.Windows.Forms.TextBox txtNums;
    }
}