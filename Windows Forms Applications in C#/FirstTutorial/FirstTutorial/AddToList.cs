using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;

namespace FirstTutorial
{
    public partial class AddToList : Form
    {
        public AddToList()
        {
            InitializeComponent();
        }

        private void btnAdd_Click(object sender, EventArgs e)
        {
            if (txtItem.Text == "")
            {
                MessageBox.Show("Please enter some text into the textbox");
            } else
            {
                lbxItems.Items.Add(txtItem.Text);
                txtItem.Clear();
                txtItem.Focus();
            }
        }

        private void btnExit_Click(object sender, EventArgs e)
        {
            this.Hide();
        }

        private void btnAddToList2_Click(object sender, EventArgs e)
        {
            if (lbxItems.Items.Count > 0)
            {
                if (lbxItems.SelectedItem == null)
                {
                    MessageBox.Show("Please select and item from the listbox 1 first");
                } else
                {
                    if (lbxItems.SelectionMode == SelectionMode.MultiSimple || lbxItems.SelectionMode == SelectionMode.MultiExtended)
                    {
                        foreach (Object item in lbxItems.SelectedItems)
                        {
                            lbxItems2.Items.Add(item.ToString());
                            lbxItems.Items.Remove(item.ToString());
                        }
                    } else
                    {
                        lbxItems2.Items.Add(lbxItems.SelectedItem);
                        lbxItems.Items.Remove(lbxItems.SelectedItem);
                    }
                }
            } else
            {
                MessageBox.Show("Please add some values to listbox 1 first");
            }
        }

        private void AddToList_Load(object sender, EventArgs e)
        {
            //lbxItems.MultiColumn = true;
            //lbxItems.SelectionMode = SelectionMode.MultiExtended;
            lbxItems.SelectionMode = SelectionMode.MultiSimple;
            string[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
            clbOne.Items.AddRange(days);
            this.MdiParent = Dashboard.ActiveForm;
        }

        private void btnClearSelections_Click(object sender, EventArgs e)
        {
            lbxItems.ClearSelected();
            lbxItems2.ClearSelected();
        }

        private void btnClb_Click(object sender, EventArgs e)
        {
            foreach (Object item in clbOne.CheckedItems)
            {
                clbTwo.Items.Add(item.ToString());
            }
            clbOne.SetItemChecked(1, true);
            clbOne.Items.Add("abc", CheckState.Indeterminate);
        }

        private void btnRemoveFromClb_Click(object sender, EventArgs e)
        {
            CheckedListBox.CheckedIndexCollection indices = clbTwo.CheckedIndices;
            for (int i = indices.Count - 1; i >= 0; i--)
            {
                clbTwo.Items.RemoveAt(indices[i]);
            }
        }
    }
}
