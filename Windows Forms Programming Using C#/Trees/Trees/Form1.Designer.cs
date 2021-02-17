
namespace Trees
{
    partial class Form1
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
            this.tv = new System.Windows.Forms.TreeView();
            this.txtNode = new System.Windows.Forms.TextBox();
            this.btnParent = new System.Windows.Forms.Button();
            this.btnChild = new System.Windows.Forms.Button();
            this.btnRemove = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // tv
            // 
            this.tv.Location = new System.Drawing.Point(0, 5);
            this.tv.Name = "tv";
            this.tv.Size = new System.Drawing.Size(284, 440);
            this.tv.TabIndex = 0;
            // 
            // txtNode
            // 
            this.txtNode.Location = new System.Drawing.Point(333, 12);
            this.txtNode.Name = "txtNode";
            this.txtNode.Size = new System.Drawing.Size(207, 22);
            this.txtNode.TabIndex = 1;
            // 
            // btnParent
            // 
            this.btnParent.Location = new System.Drawing.Point(333, 58);
            this.btnParent.Name = "btnParent";
            this.btnParent.Size = new System.Drawing.Size(75, 23);
            this.btnParent.TabIndex = 2;
            this.btnParent.Text = "Parent";
            this.btnParent.UseVisualStyleBackColor = true;
            this.btnParent.Click += new System.EventHandler(this.btnParent_Click);
            // 
            // btnChild
            // 
            this.btnChild.Location = new System.Drawing.Point(465, 58);
            this.btnChild.Name = "btnChild";
            this.btnChild.Size = new System.Drawing.Size(75, 23);
            this.btnChild.TabIndex = 3;
            this.btnChild.Text = "Child";
            this.btnChild.UseVisualStyleBackColor = true;
            this.btnChild.Click += new System.EventHandler(this.btnChild_Click);
            // 
            // btnRemove
            // 
            this.btnRemove.Location = new System.Drawing.Point(333, 159);
            this.btnRemove.Name = "btnRemove";
            this.btnRemove.Size = new System.Drawing.Size(75, 23);
            this.btnRemove.TabIndex = 4;
            this.btnRemove.Text = "Remove";
            this.btnRemove.UseVisualStyleBackColor = true;
            this.btnRemove.Click += new System.EventHandler(this.btnRemove_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.btnRemove);
            this.Controls.Add(this.btnChild);
            this.Controls.Add(this.btnParent);
            this.Controls.Add(this.txtNode);
            this.Controls.Add(this.tv);
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TreeView tv;
        private System.Windows.Forms.TextBox txtNode;
        private System.Windows.Forms.Button btnParent;
        private System.Windows.Forms.Button btnChild;
        private System.Windows.Forms.Button btnRemove;
    }
}

