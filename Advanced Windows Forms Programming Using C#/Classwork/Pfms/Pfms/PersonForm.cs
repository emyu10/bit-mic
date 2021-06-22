using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Diagnostics;

namespace Pfms
{
    public partial class PersonForm : Form
    {
        public PersonForm()
        {
            InitializeComponent();
        }

        private void LoadData()
        {
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

        private void PersonForm_Load(object sender, EventArgs e)
        {
            MdiParent = Form1.ActiveForm;
            LoadData();
        }

        private void btnCancel_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void btnSave_Click(object sender, EventArgs e)
        {
            bool filled = txtName.Text != "" && txtFriendlyName.Text != "" && txtContactNumber.Text != null;
            if (!filled)
            {
                MessageBox.Show("Name, Friendly Name and Contact Number fields are required");
                return;
            }

            try
            {
                string name = txtName.Text;
                string friendlyName = txtFriendlyName.Text;
                string contactNumber = txtContactNumber.Text;
                var result = Person.Save(name, friendlyName, contactNumber);
                if (result)
                {
                    MessageBox.Show("Person information saved");
                    LoadData();
                }
                else
                {
                    MessageBox.Show("Could not save person information");
                }
            }
            catch
            {
                MessageBox.Show("Could not save person information");
            }
        }

        private void dgvPersons_RowHeaderMouseClick(object sender, DataGridViewCellMouseEventArgs e)
        {
            DataGridView gridView = (DataGridView)sender;
            DataGridViewCell cell = gridView.Rows[e.RowIndex].Cells[0];
            try
            {
                Person person = Person.GetById((int)cell.Value);
                if (person == null)
                {
                    MessageBox.Show("Could not select person");
                }
                else
                {
                    txtId.Text = person.Id.ToString();
                    txtName.Text = person.Name;
                    txtFriendlyName.Text = person.FriendlyName;
                    txtContactNumber.Text = person.ContactNumber;
                    dtAddedDate.Value = person.AddedDate;
                }
            }
            catch
            {
                MessageBox.Show("Could not select person");
            }
        }

        private void btnUpdate_Click(object sender, EventArgs e)
        {
            try
            {
                int id = int.Parse(txtId.Text);
                string name = txtName.Text;
                string friendlyName = txtFriendlyName.Text;
                string contactNumber = txtContactNumber.Text;

                var result = Person.Update(id, name, friendlyName, contactNumber);
                if (result)
                {
                    MessageBox.Show("Person information updated");
                    LoadData();
                }
                else
                {
                    MessageBox.Show("Could not update person information");
                }
            }
            catch
            {
                MessageBox.Show("Could not update person information");
            }
        }

        private void btnDelete_Click(object sender, EventArgs e)
        {
            try
            {
                var result = Person.Delete(int.Parse(txtId.Text));
                if (result)
                {
                    MessageBox.Show("Person deleted");
                    LoadData();
                }
                else
                {
                    MessageBox.Show("Could not delete person");
                }
            }
            catch
            {
                MessageBox.Show("Could not delete person");
            }
        }
    }
}
