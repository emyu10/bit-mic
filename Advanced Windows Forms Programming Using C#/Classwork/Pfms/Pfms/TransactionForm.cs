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
    public partial class TransactionForm : Form
    {
        private Account account = null;
        private List<Account> allAccounts = new List<Account>();
        private List<Category> allCategories = new List<Category>();
        private List<Person> allPersons = new List<Person>();
        
        public TransactionForm()
        {
            InitializeComponent();
        }

        public void SetAccount(Account account)
        {
            this.account = account;
        }

        private void LoadAccounts()
        {
            try {
                allAccounts = Account.GetAllAccounts();
            }
            catch {
                MessageBox.Show("Could not load accounts");
            }
        }

        private void LoadCategories()
        {
            try {
                allCategories = Category.GetAll();
                cbCategory.DataSource = allCategories;
            }
            catch { MessageBox.Show("Could not load categories"); }
        }

        private void LoadPersons()
        {
            try {
                allPersons = Person.GetAll();
                var person = new Person();
                allPersons.Insert(0, person);
                cbPerson.DataSource = allPersons;
            }
            catch { MessageBox.Show("Could not load persons"); }
        }

        private void TransactionForm_Load(object sender, EventArgs e)
        {
            MdiParent = Form1.ActiveForm;
            //LoadAccounts();
            LoadCategories();
            LoadPersons();
            txtAccount.Text = account.ToString();
        }

        private void btnSave_Click(object sender, EventArgs e)
        {
            try
            {
                var category = (Category)cbCategory.SelectedItem;
                var amount = decimal.Parse(txtAmount.Text);
                var details = txtDetails.Text;
                var person = (Person)cbPerson.SelectedItem;
                var transactionDate = dtTransDate.Value;
                bool filled = account.Id != -1 && category.Name != "" && txtAmount.Text != "" && details != "" && transactionDate != null;

                if (!filled)
                {
                    MessageBox.Show("All fields except person is compulsory");
                    return;
                }


                if (amount <= 0)
                {
                    MessageBox.Show("Amount should be greater than 0");
                    return;
                }

                bool result1 = true;
                bool result2 = false;

                if (account.ParentId != -1)
                {
                    Account parent = Account.GetAccountById(account.ParentId);
                    result1 = Transaction.Save(parent, category, amount, "From sub account: " + details, transactionDate, person.Id);
                    if (result1)
                    {
                        result2 = Transaction.Save(account, category, amount, details, transactionDate, person.Id);
                    }
                }
                else
                {
                    result2 = Transaction.Save(account, category, amount, details, transactionDate, person.Id);
                }

                if (result1 && result2) MessageBox.Show("Transaction saved");
                else MessageBox.Show("Could not save transaction");
            }
            catch (FormatException)
            {
                MessageBox.Show("Please enter values in the correct format");
            }
            catch (InvalidOperationException ex)
            {
                MessageBox.Show(ex.Message);
            }
            catch
            {
                MessageBox.Show("Could not save transaction");
            }
        }
    }
}
