
namespace FirstTutorial
{
    partial class AddToList
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
            this.txtItem = new System.Windows.Forms.TextBox();
            this.btnAdd = new System.Windows.Forms.Button();
            this.lbxItems = new System.Windows.Forms.ListBox();
            this.label2 = new System.Windows.Forms.Label();
            this.btnExit = new System.Windows.Forms.Button();
            this.btnAddToList2 = new System.Windows.Forms.Button();
            this.lbxItems2 = new System.Windows.Forms.ListBox();
            this.btnClearSelections = new System.Windows.Forms.Button();
            this.clbOne = new System.Windows.Forms.CheckedListBox();
            this.clbTwo = new System.Windows.Forms.CheckedListBox();
            this.btnClb = new System.Windows.Forms.Button();
            this.btnRemoveFromClb = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(53, 28);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(86, 20);
            this.label1.TabIndex = 0;
            this.label1.Text = "Enter a Text";
            // 
            // txtItem
            // 
            this.txtItem.Location = new System.Drawing.Point(53, 68);
            this.txtItem.Name = "txtItem";
            this.txtItem.Size = new System.Drawing.Size(125, 27);
            this.txtItem.TabIndex = 1;
            // 
            // btnAdd
            // 
            this.btnAdd.Location = new System.Drawing.Point(213, 68);
            this.btnAdd.Name = "btnAdd";
            this.btnAdd.Size = new System.Drawing.Size(94, 29);
            this.btnAdd.TabIndex = 2;
            this.btnAdd.Text = ">>";
            this.btnAdd.UseVisualStyleBackColor = true;
            this.btnAdd.Click += new System.EventHandler(this.btnAdd_Click);
            // 
            // lbxItems
            // 
            this.lbxItems.FormattingEnabled = true;
            this.lbxItems.ItemHeight = 20;
            this.lbxItems.Location = new System.Drawing.Point(345, 68);
            this.lbxItems.Name = "lbxItems";
            this.lbxItems.Size = new System.Drawing.Size(150, 104);
            this.lbxItems.TabIndex = 3;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(382, 28);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(56, 20);
            this.label2.TabIndex = 4;
            this.label2.Text = "The list";
            // 
            // btnExit
            // 
            this.btnExit.Location = new System.Drawing.Point(345, 335);
            this.btnExit.Name = "btnExit";
            this.btnExit.Size = new System.Drawing.Size(94, 29);
            this.btnExit.TabIndex = 5;
            this.btnExit.Text = "Exit";
            this.btnExit.UseVisualStyleBackColor = true;
            this.btnExit.Click += new System.EventHandler(this.btnExit_Click);
            // 
            // btnAddToList2
            // 
            this.btnAddToList2.Location = new System.Drawing.Point(536, 67);
            this.btnAddToList2.Name = "btnAddToList2";
            this.btnAddToList2.Size = new System.Drawing.Size(94, 29);
            this.btnAddToList2.TabIndex = 6;
            this.btnAddToList2.Text = ">>";
            this.btnAddToList2.UseVisualStyleBackColor = true;
            this.btnAddToList2.Click += new System.EventHandler(this.btnAddToList2_Click);
            // 
            // lbxItems2
            // 
            this.lbxItems2.FormattingEnabled = true;
            this.lbxItems2.ItemHeight = 20;
            this.lbxItems2.Location = new System.Drawing.Point(680, 68);
            this.lbxItems2.Name = "lbxItems2";
            this.lbxItems2.Size = new System.Drawing.Size(150, 104);
            this.lbxItems2.TabIndex = 7;
            // 
            // btnClearSelections
            // 
            this.btnClearSelections.Location = new System.Drawing.Point(468, 335);
            this.btnClearSelections.Name = "btnClearSelections";
            this.btnClearSelections.Size = new System.Drawing.Size(180, 29);
            this.btnClearSelections.TabIndex = 8;
            this.btnClearSelections.Text = "Clear Selections";
            this.btnClearSelections.UseVisualStyleBackColor = true;
            this.btnClearSelections.Click += new System.EventHandler(this.btnClearSelections_Click);
            // 
            // clbOne
            // 
            this.clbOne.FormattingEnabled = true;
            this.clbOne.Location = new System.Drawing.Point(345, 203);
            this.clbOne.Name = "clbOne";
            this.clbOne.Size = new System.Drawing.Size(150, 114);
            this.clbOne.TabIndex = 9;
            // 
            // clbTwo
            // 
            this.clbTwo.FormattingEnabled = true;
            this.clbTwo.Location = new System.Drawing.Point(680, 203);
            this.clbTwo.Name = "clbTwo";
            this.clbTwo.Size = new System.Drawing.Size(150, 114);
            this.clbTwo.TabIndex = 10;
            // 
            // btnClb
            // 
            this.btnClb.Location = new System.Drawing.Point(536, 240);
            this.btnClb.Name = "btnClb";
            this.btnClb.Size = new System.Drawing.Size(94, 29);
            this.btnClb.TabIndex = 11;
            this.btnClb.Text = "=>";
            this.btnClb.UseVisualStyleBackColor = true;
            this.btnClb.Click += new System.EventHandler(this.btnClb_Click);
            // 
            // btnRemoveFromClb
            // 
            this.btnRemoveFromClb.Location = new System.Drawing.Point(680, 324);
            this.btnRemoveFromClb.Name = "btnRemoveFromClb";
            this.btnRemoveFromClb.Size = new System.Drawing.Size(94, 29);
            this.btnRemoveFromClb.TabIndex = 12;
            this.btnRemoveFromClb.Text = "^ Remove";
            this.btnRemoveFromClb.UseVisualStyleBackColor = true;
            this.btnRemoveFromClb.Click += new System.EventHandler(this.btnRemoveFromClb_Click);
            // 
            // AddToList
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(881, 391);
            this.Controls.Add(this.btnRemoveFromClb);
            this.Controls.Add(this.btnClb);
            this.Controls.Add(this.clbTwo);
            this.Controls.Add(this.clbOne);
            this.Controls.Add(this.btnClearSelections);
            this.Controls.Add(this.lbxItems2);
            this.Controls.Add(this.btnAddToList2);
            this.Controls.Add(this.btnExit);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.lbxItems);
            this.Controls.Add(this.btnAdd);
            this.Controls.Add(this.txtItem);
            this.Controls.Add(this.label1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.MaximizeBox = false;
            this.Name = "AddToList";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "AddToList";
            this.Load += new System.EventHandler(this.AddToList_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox txtItem;
        private System.Windows.Forms.Button btnAdd;
        private System.Windows.Forms.ListBox lbxItems;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Button btnExit;
        private System.Windows.Forms.Button btnAddToList2;
        private System.Windows.Forms.ListBox lbxItems2;
        private System.Windows.Forms.Button btnClearSelections;
        private System.Windows.Forms.CheckedListBox clbOne;
        private System.Windows.Forms.CheckedListBox clbTwo;
        private System.Windows.Forms.Button btnClb;
        private System.Windows.Forms.Button btnRemoveFromClb;
    }
}