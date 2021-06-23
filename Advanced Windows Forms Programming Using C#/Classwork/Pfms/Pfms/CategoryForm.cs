using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Pfms
{
    public partial class CategoryForm : Form
    {
        public CategoryForm()
        {
            InitializeComponent();
        }

        private void CategoryForm_Load(object sender, EventArgs e)
        {
            MdiParent = Form1.ActiveForm;
            LoadData();
        }

        private void LoadData()
        {
            try
            {
                DataTable table = Category.GetAllCategories();
                dgvCategories.DataSource = table;
            }
            catch
            {
                MessageBox.Show("Could not get categories");
            }
        }

        private void btnCancel_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void btnSave_Click(object sender, EventArgs e)
        {
            try
            {
                char direction = rdbIn.Checked ? '+' : (rdbOut.Checked ? '-' : '0');
                string name = txtName.Text;

                bool filled = name != "" && direction != '0';

                if (!filled)
                {
                    MessageBox.Show("Please enter category name and select a direction");
                    return;
                }

                var result = Category.Save(name, direction);
                if (result)
                {
                    LoadData();
                }
                else
                {
                    MessageBox.Show("Could not save category");
                }
            }
            catch
            {
                MessageBox.Show("Could not save category");
            }
        }

        private void dgvCategories_RowHeaderMouseClick(object sender, DataGridViewCellMouseEventArgs e)
        {
            DataGridView gridView = (DataGridView)sender;
            DataGridViewCell cell = gridView.Rows[e.RowIndex].Cells[0];
            try
            {
                Category category = Category.GetById((int)cell.Value);
                if (category == null)
                {
                    MessageBox.Show("Could not select category");
                }
                else
                {
                    txtId.Text = category.Id.ToString();
                    txtName.Text = category.Name;
                    if (category.TransactionDirection == '+') rdbIn.Checked = true;
                    if (category.TransactionDirection == '-') rdbOut.Checked = true;
                    dtAddedDate.Value = category.AddedDate;
                }
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine(ex.Message);
                MessageBox.Show("Could not select category");
            }
        }

        private void btnUpdate_Click(object sender, EventArgs e)
        {
            if (txtId.Text == "")
            {
                MessageBox.Show("Select a category to update");
                return;
            }
            try
            {
                int id = int.Parse(txtId.Text);
                string name = txtName.Text;
                char direction = rdbIn.Checked ? '+' : (rdbOut.Checked ? '-' : '0');
                
                bool filled = name != "" && direction != '0';

                if (!filled)
                {
                    MessageBox.Show("Please enter category name and select a direction");
                    return;
                }

                var result = Category.Update(id, name, direction);
                if (result)
                {
                    MessageBox.Show("Category updated");
                    LoadData();
                }
                else
                {
                    MessageBox.Show("Could not update category");
                }
            }
            catch
            {
                MessageBox.Show("Could not update category");
            }
        }

        private void btnDelete_Click(object sender, EventArgs e)
        {
            if (txtId.Text == "")
            {
                MessageBox.Show("Select a category");
                return;
            }
            try
            {
                int id = int.Parse(txtId.Text);
                var result = Category.Delete(id);
                if (result)
                {
                    MessageBox.Show("Category deleted");
                    LoadData();
                }
                else
                {
                    MessageBox.Show("Could not delete category");
                }
            }
            catch
            {
                MessageBox.Show("Could not delete category");
            }
        }
    }
}
