using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;
using System.Collections;

namespace WordGenerator
{
    public partial class Form1 : Form
    {
        // I need a variable to store the letters
        string letters = null;

        // variable to store the database connection
        SqlConnection con = new SqlConnection("Data source = 192.168.122.17; Initial catalog = WordGenerator; User id = sa; Password = mql@9933343");

        public Form1()
        {
            InitializeComponent();
        }

        // I need a method to get a short listed set of words from the database
        // when the letters are provided by the user
        private ArrayList GetWords()
        {
            ArrayList words = new ArrayList();

            // force the user to enter some letters before proceeding
            if (letters == null)
            {
                MessageBox.Show("Please enter some letters");
                return null;
            }
            char[] chars = letters.ToArray();

            // after getting the letters as an array of characters, I want to generate a select query
            
            string sql = "select Word from Words where ";
            int i = 0;
            foreach (char c in chars)
            {
                if (i != 0)
                {
                    sql += " or ";
                }
                sql += "Word like '%" + c.ToString() + "%' ";
                i++;
            }

            try
            {
                con.Open();
                SqlCommand selectCmd = new SqlCommand(sql, con);
                SqlDataReader reader = selectCmd.ExecuteReader();
                while (reader.Read())
                {
                    words.Add((string) reader[0]);
                }
            }
            catch (Exception e)
            {
                MessageBox.Show("We could not get a word list at this time\n" + e.Message);
            }
            finally
            {
                if (con != null)
                {
                    con.Close();
                }
            }

            return words;
        }

        private void btnGenerate_Click(object sender, EventArgs e)
        {
            letters = txtLetters.Text;
            ArrayList dbWords = GetWords();

            // another arraylist to hold the "good" words
            ArrayList filteredWords = new ArrayList();

            foreach (string word in dbWords)
            {
                // first rule: the word should be less or equal in lenth to the letters
                if (word.Length > letters.Length) continue;

                // second rule: all the characters in the word should be in the set of letters
                char[] letterSet = letters.ToArray();
                char[] wordSet = word.ToArray();
                bool goodWord = true;
                foreach (char wl in wordSet)
                {
                    // the logic here is that each letter (wl) from the word should match a letter from the letter set
                    // otherwise the word is not a goodWord
                    // so first assume that the word is good
                    if (!letterSet.Contains(wl))
                    {
                        goodWord = false;
                        break;
                    }
                    for (int i = 0; i < letterSet.Length; i++)
                    {
                        // then keep removing the letter from the letterSet
                        if (wl == letterSet[i])
                        {
                            letterSet[i] = '`'; // seems like i cant assign a null character to a char type variable
                            break;
                        }
                    }
                }

                // now check if the word is still good and add it to the filteredWords ArrayList
                if (goodWord)
                {
                    filteredWords.Add(word);
                }
            }

            // when all the words are checked and filtered into the array list, add it to the listbox
            lbxWords.Items.Clear();
            lbxWords.Items.AddRange(filteredWords.ToArray());
        }

        // now for the logic to add new words to the database
        // I can write the logic inside the click handler of the button "New Word"
        // but I will write a different method to handle the inserting itself
        // and call the method from within the event handler for the click event of the button
        private void AddNewWord(string word)
        {
            try
            {
                con.Open();
                string insertQuery = @"insert into Words values ('" + word + "')";
                SqlCommand insertCommand = new SqlCommand(insertQuery, con);
                if (insertCommand.ExecuteNonQuery() > 0)
                {
                    MessageBox.Show("New word added");
                }
                else
                {
                    MessageBox.Show("Could not add the new word");
                }
            }
            catch (Exception e)
            {
                MessageBox.Show("Could not add the new word\n\n" + e.Message);
            }
            finally
            {
                if (con != null)
                {
                    con.Close();
                }
            }
        }

        private void btnNewWord_Click(object sender, EventArgs e)
        {
            if (txtLetters.Text == "")
            {
                MessageBox.Show("Enter the word");
            }
            else
            {
                AddNewWord(txtLetters.Text);
            }
        }
    }
}
