
namespace ImageProgram
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
            this.thePicture = new System.Windows.Forms.PictureBox();
            this.btnSetImage = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.thePicture)).BeginInit();
            this.SuspendLayout();
            // 
            // thePicture
            // 
            this.thePicture.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.thePicture.Location = new System.Drawing.Point(12, 12);
            this.thePicture.Name = "thePicture";
            this.thePicture.Size = new System.Drawing.Size(776, 380);
            this.thePicture.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.thePicture.TabIndex = 0;
            this.thePicture.TabStop = false;
            this.thePicture.Click += new System.EventHandler(this.thePicture_Click);
            this.thePicture.MouseClick += new System.Windows.Forms.MouseEventHandler(this.thePicture_MouseClick);
            // 
            // btnSetImage
            // 
            this.btnSetImage.Location = new System.Drawing.Point(688, 410);
            this.btnSetImage.Name = "btnSetImage";
            this.btnSetImage.Size = new System.Drawing.Size(75, 35);
            this.btnSetImage.TabIndex = 1;
            this.btnSetImage.Text = "Set Image";
            this.btnSetImage.UseVisualStyleBackColor = true;
            this.btnSetImage.Click += new System.EventHandler(this.btnSetImage_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.btnSetImage);
            this.Controls.Add(this.thePicture);
            this.Name = "Form1";
            this.Text = "Form1";
            ((System.ComponentModel.ISupportInitialize)(this.thePicture)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.PictureBox thePicture;
        private System.Windows.Forms.Button btnSetImage;
    }
}

