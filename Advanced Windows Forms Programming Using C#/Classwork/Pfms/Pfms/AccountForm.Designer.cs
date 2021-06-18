
namespace Pfms
{
    partial class AccountForm
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
            this.dgvAllAccounts = new System.Windows.Forms.DataGridView();
            this.label1 = new System.Windows.Forms.Label();
            this.tvAccounts = new System.Windows.Forms.TreeView();
            ((System.ComponentModel.ISupportInitialize)(this.dgvAllAccounts)).BeginInit();
            this.SuspendLayout();
            // 
            // dgvAllAccounts
            // 
            this.dgvAllAccounts.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgvAllAccounts.Location = new System.Drawing.Point(12, 110);
            this.dgvAllAccounts.Name = "dgvAllAccounts";
            this.dgvAllAccounts.Size = new System.Drawing.Size(776, 328);
            this.dgvAllAccounts.TabIndex = 0;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(12, 81);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(71, 13);
            this.label1.TabIndex = 1;
            this.label1.Text = "Accounts List";
            // 
            // tvAccounts
            // 
            this.tvAccounts.Location = new System.Drawing.Point(12, 488);
            this.tvAccounts.Name = "tvAccounts";
            this.tvAccounts.Size = new System.Drawing.Size(776, 97);
            this.tvAccounts.TabIndex = 2;
            // 
            // AccountForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 791);
            this.Controls.Add(this.tvAccounts);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.dgvAllAccounts);
            this.Name = "AccountForm";
            this.Text = "Accounts List";
            this.Load += new System.EventHandler(this.AccountForm_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dgvAllAccounts)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.DataGridView dgvAllAccounts;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TreeView tvAccounts;
    }
}