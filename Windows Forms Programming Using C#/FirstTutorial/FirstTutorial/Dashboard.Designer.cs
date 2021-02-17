
namespace FirstTutorial
{
    partial class Dashboard
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
            this.tsFormButtons = new System.Windows.Forms.ToolStrip();
            this.SuspendLayout();
            // 
            // tsFormButtons
            // 
            this.tsFormButtons.ImageScalingSize = new System.Drawing.Size(20, 20);
            this.tsFormButtons.Location = new System.Drawing.Point(0, 0);
            this.tsFormButtons.Name = "tsFormButtons";
            this.tsFormButtons.Size = new System.Drawing.Size(997, 25);
            this.tsFormButtons.TabIndex = 6;
            this.tsFormButtons.Text = "toolStrip1";
            this.tsFormButtons.ItemClicked += new System.Windows.Forms.ToolStripItemClickedEventHandler(this.tsFormButtons_ItemClicked);
            // 
            // Dashboard
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(997, 661);
            this.Controls.Add(this.tsFormButtons);
            this.IsMdiContainer = true;
            this.Name = "Dashboard";
            this.Text = "Dashboard";
            this.WindowState = System.Windows.Forms.FormWindowState.Maximized;
            this.Load += new System.EventHandler(this.Dashboard_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.ToolStrip tsFormButtons;
    }
}