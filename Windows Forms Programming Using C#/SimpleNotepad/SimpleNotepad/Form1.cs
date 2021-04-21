using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace SimpleNotepad
{
    public partial class Form1 : Form
    {
        private string currentFileName = "";

        public Form1()
        {
            InitializeComponent();
        }

        private void aboutToolStripMenuItem_Click(object sender, EventArgs e)
        {
            (new Form2()).Show();
        }

        private void newToolStripMenuItem_Click(object sender, EventArgs e)
        {
            editor.Text = "";
            currentFileName = "";
            updateTitle();
        }

        private void cutToolStripMenuItem_Click(object sender, EventArgs e)
        {
            editor.Cut();
        }

        private void copyToolStripMenuItem_Click(object sender, EventArgs e)
        {
            editor.Copy();
        }

        private void pasteToolStripMenuItem_Click(object sender, EventArgs e)
        {
            editor.Paste();
        }

        private void redoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            editor.Redo();
        }

        private void undoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            editor.Undo();
        }

        private void cutToolStripMenuItem1_Click(object sender, EventArgs e)
        {
            editor.Cut();
        }

        private void copyToolStripMenuItem1_Click(object sender, EventArgs e)
        {
            editor.Copy();
        }

        private void pasteToolStripMenuItem1_Click(object sender, EventArgs e)
        {
            editor.Copy();
        }

        private void selectAllToolStripMenuItem_Click(object sender, EventArgs e)
        {
            editor.SelectAll();
        }

        private void exitToolStripMenuItem_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void openToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (openDialog.ShowDialog() == DialogResult.OK)
            {
                editor.LoadFile(openDialog.FileName, RichTextBoxStreamType.RichText);
                currentFileName = openDialog.FileName;
                updateTitle();
            }
        }

        private void saveAsToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (saveDialog.ShowDialog() == DialogResult.OK)
            {
                string fileName = saveDialog.FileName;
                editor.SaveFile(fileName, RichTextBoxStreamType.RichText);
                currentFileName = fileName;
                updateTitle();
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            updateTitle();
        }

        private void updateTitle()
        {
            this.Text = "My Notepad [" + currentFileName + "]";
        }

        private void saveToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (currentFileName == "")
            {
                saveAsToolStripMenuItem_Click(sender, e);
            } else
            {
                editor.SaveFile(currentFileName, RichTextBoxStreamType.RichText);
            }
        }
    }
}
