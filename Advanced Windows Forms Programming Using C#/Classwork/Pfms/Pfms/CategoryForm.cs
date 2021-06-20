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
    }
}
