
namespace Pfms
{
    partial class TransactionForm
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(TransactionForm));
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.label7 = new System.Windows.Forms.Label();
            this.label8 = new System.Windows.Forms.Label();
            this.txtId = new System.Windows.Forms.TextBox();
            this.txtAmount = new System.Windows.Forms.TextBox();
            this.cbCategory = new System.Windows.Forms.ComboBox();
            this.txtDetails = new System.Windows.Forms.TextBox();
            this.cbPerson = new System.Windows.Forms.ComboBox();
            this.dtTransDate = new System.Windows.Forms.DateTimePicker();
            this.dtAddedDate = new System.Windows.Forms.DateTimePicker();
            this.btnSave = new System.Windows.Forms.Button();
            this.txtAccount = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(31, 17);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(75, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "Transaction Id";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(59, 49);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(47, 13);
            this.label2.TabIndex = 1;
            this.label2.Text = "Account";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(57, 81);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(49, 13);
            this.label3.TabIndex = 2;
            this.label3.Text = "Category";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(63, 113);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(43, 13);
            this.label4.TabIndex = 3;
            this.label4.Text = "Amount";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(408, 17);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(39, 13);
            this.label5.TabIndex = 4;
            this.label5.Text = "Details";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(407, 49);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(40, 13);
            this.label6.TabIndex = 5;
            this.label6.Text = "Person";
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(358, 81);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(89, 13);
            this.label7.TabIndex = 6;
            this.label7.Text = "Transaction Date";
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Location = new System.Drawing.Point(383, 113);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(64, 13);
            this.label8.TabIndex = 7;
            this.label8.Text = "Added Date";
            // 
            // txtId
            // 
            this.txtId.Location = new System.Drawing.Point(127, 13);
            this.txtId.Name = "txtId";
            this.txtId.ReadOnly = true;
            this.txtId.Size = new System.Drawing.Size(176, 20);
            this.txtId.TabIndex = 8;
            // 
            // txtAmount
            // 
            this.txtAmount.Location = new System.Drawing.Point(127, 109);
            this.txtAmount.Name = "txtAmount";
            this.txtAmount.Size = new System.Drawing.Size(176, 20);
            this.txtAmount.TabIndex = 9;
            this.txtAmount.Text = "0";
            // 
            // cbCategory
            // 
            this.cbCategory.FormattingEnabled = true;
            this.cbCategory.Location = new System.Drawing.Point(127, 77);
            this.cbCategory.Name = "cbCategory";
            this.cbCategory.Size = new System.Drawing.Size(176, 21);
            this.cbCategory.TabIndex = 11;
            // 
            // txtDetails
            // 
            this.txtDetails.Location = new System.Drawing.Point(476, 13);
            this.txtDetails.Name = "txtDetails";
            this.txtDetails.Size = new System.Drawing.Size(176, 20);
            this.txtDetails.TabIndex = 12;
            // 
            // cbPerson
            // 
            this.cbPerson.FormattingEnabled = true;
            this.cbPerson.Location = new System.Drawing.Point(476, 45);
            this.cbPerson.Name = "cbPerson";
            this.cbPerson.Size = new System.Drawing.Size(176, 21);
            this.cbPerson.TabIndex = 13;
            // 
            // dtTransDate
            // 
            this.dtTransDate.Location = new System.Drawing.Point(476, 77);
            this.dtTransDate.Name = "dtTransDate";
            this.dtTransDate.Size = new System.Drawing.Size(176, 20);
            this.dtTransDate.TabIndex = 14;
            // 
            // dtAddedDate
            // 
            this.dtAddedDate.Enabled = false;
            this.dtAddedDate.Location = new System.Drawing.Point(476, 109);
            this.dtAddedDate.Name = "dtAddedDate";
            this.dtAddedDate.Size = new System.Drawing.Size(176, 20);
            this.dtAddedDate.TabIndex = 15;
            // 
            // btnSave
            // 
            this.btnSave.Location = new System.Drawing.Point(34, 180);
            this.btnSave.Name = "btnSave";
            this.btnSave.Size = new System.Drawing.Size(75, 23);
            this.btnSave.TabIndex = 16;
            this.btnSave.Text = "Save";
            this.btnSave.UseVisualStyleBackColor = true;
            this.btnSave.Click += new System.EventHandler(this.btnSave_Click);
            // 
            // txtAccount
            // 
            this.txtAccount.Location = new System.Drawing.Point(127, 45);
            this.txtAccount.Name = "txtAccount";
            this.txtAccount.ReadOnly = true;
            this.txtAccount.Size = new System.Drawing.Size(176, 20);
            this.txtAccount.TabIndex = 17;
            // 
            // TransactionForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(692, 501);
            this.Controls.Add(this.txtAccount);
            this.Controls.Add(this.btnSave);
            this.Controls.Add(this.dtAddedDate);
            this.Controls.Add(this.dtTransDate);
            this.Controls.Add(this.cbPerson);
            this.Controls.Add(this.txtDetails);
            this.Controls.Add(this.cbCategory);
            this.Controls.Add(this.txtAmount);
            this.Controls.Add(this.txtId);
            this.Controls.Add(this.label8);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MaximizeBox = false;
            this.Name = "TransactionForm";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Transactions";
            this.Load += new System.EventHandler(this.TransactionForm_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.TextBox txtId;
        private System.Windows.Forms.TextBox txtAmount;
        private System.Windows.Forms.ComboBox cbCategory;
        private System.Windows.Forms.TextBox txtDetails;
        private System.Windows.Forms.ComboBox cbPerson;
        private System.Windows.Forms.DateTimePicker dtTransDate;
        private System.Windows.Forms.DateTimePicker dtAddedDate;
        private System.Windows.Forms.Button btnSave;
        private System.Windows.Forms.TextBox txtAccount;
    }
}