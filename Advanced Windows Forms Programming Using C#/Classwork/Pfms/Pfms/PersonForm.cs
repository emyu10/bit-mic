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
    public partial class PersonForm : Form
    {
        public PersonForm()
        {
            InitializeComponent();
        }

        private void PersonForm_Load(object sender, EventArgs e)
        {
            MdiParent = Form1.ActiveForm;
            try
            {
                DataTable table = Person.GetAllPersons();
                dgvPersons.DataSource = table;
            }
            catch
            {
                MessageBox.Show("Could not get people list");
            }
        }
    }
}
