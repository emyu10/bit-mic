using System;
using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using Microsoft.Data.Sqlite;

namespace GuessTheWord
{
    public partial class Form1 : Form
    {
        // the database file should be copied to where the final .exe is, because the path is given
        // as a relative path to the application
        // when debuggin, it should be in the debug folder
        private SqliteConnection con = new SqliteConnection("Data source = guess_the_word.db");
        private SqliteCommand com = new SqliteCommand();

        // selected player
        private Player selectedPlayer = null;

        // get a random word from the database and store here
        private Word selectedWord = null;

        // the total score that can be achieved from the current game
        private int score = 0;

        private Scoreboard scores = new Scoreboard();

        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            //GetWord(2, 9);
        }

        private void StartNewGame()
        {
            // Reset any ongoing game
            ResetGame();

            // a difficulty level should be set initially
            /*
             * easy -> 2 ~ 5
             * medium -> 6 ~ 12
             * difficult -> 13 ~ 22
             */
            // define the min and max depending on the difficulty level selected
            int min = 0;
            int max = 0;
            if (rdbEasy.Checked)
            {
                min = 2;
                max = 5;
            }

            if (rdbMedium.Checked)
            {
                min = 6;
                max = 12;
            }

            if (rdbDifficult.Checked)
            {
                min = 13;
                max = 22;
            }

            // check if the player name is entered
            if (txtPlayer.Text == "")
            {
                MessageBox.Show("Enter player name");
                txtPlayer.Focus();
                return;
            }

            // save the player and get a hold of the player
            selectedPlayer = GetPlayer(txtPlayer.Text);
            if (selectedPlayer == null)
            {
                if (SavePlayer(txtPlayer.Text))
                {
                    selectedPlayer = GetPlayer(txtPlayer.Text);
                }
                else
                {
                    MessageBox.Show("Could not save player information");
                    return;
                }
            }

            // get the word
            GetWord(min, max);

            // check if a word is selected from the database
            if (selectedWord == null)
            {
                MessageBox.Show("Word is not set");
                return;
            }

            // generate the letter buttons
            Button[] buttons = new Button[selectedWord.Text.Length];
            for (int i = 0; i < buttons.Length; i++)
            {
                buttons[i] = new Button();
                buttons[i].BackColor = Color.White;
                buttons[i].ForeColor = Color.White;
                buttons[i].Text = selectedWord.Text[i].ToString().ToUpper();
                // assign the event handler to the click event of the button
                buttons[i].Click += LetterButtonClicked;
            }
            // add the button to the panel
            pnlLetters.Controls.Clear();
            pnlLetters.Controls.AddRange(buttons);
        }

        private void GetWord(int min, int max)
        {
            // also I need a way to randomize the word I am getting
            Random rand = new Random();

            // an ArrayList to hold the returned words so that i can choose a random number from the words
            ArrayList words = new ArrayList();

            string sql = "select id, word from (";
            sql += "select id, word, length(word) as word_len from words";
            sql += ")";
            sql += "where word_len >= " + min + " and word_len <= " + max;

            try
            {
                con.Open();
                com = new SqliteCommand(sql, con);
                SqliteDataReader r = com.ExecuteReader();
                
                while (r.Read())
                {
                    words.Add(new Word(r.GetInt64(0), r.GetString(1)));
                }
                r.Close();

                int numWords = words.Count;
                
                // to make sure i do not get a random number which is bigger than the number of words
                int randomNumber = rand.Next() % numWords;

                // now the random number will be less than the number of words returned
                selectedWord = (Word) words[randomNumber];
                score = selectedWord.Text.Length;
            }
            catch (Exception ex)
            {
                MessageBox.Show("Could not get a word right now.\n\n" + ex.Message, "Error");
            }
            finally
            {
                if (con != null) con.Close();
            }
        }

        private void btnNew_Click(object sender, EventArgs e)
        {
            StartNewGame();
        }

        // an event handler for the letter buttons
        // when clicked, it should show the letter in the button
        // and deduct points from the ongoing game
        private void LetterButtonClicked(object sender, EventArgs args)
        {
            Button button = (Button)sender;
            button.ForeColor = Color.Black;
            score--;
        }

        // reset the game parameters
        private void ResetGame()
        {
            selectedWord = null;
            score = 0;
            txtWord.Clear();
            pnlLetters.Controls.Clear();
        }

        private void btnGuess_Click(object sender, EventArgs e)
        {
            if (txtWord.Text == selectedWord.Text)
            {
                // save the score and reset the game
                SaveGameScore();
                ResetGame();
            }
            else
            {
                if (score == 0)
                {
                    MessageBox.Show("You are out of moves.");
                    SaveGameScore();
                    ResetGame();
                }
                else
                {
                    MessageBox.Show("Wrong! Try again");
                    txtWord.Clear();
                }
            }
        }

        private void SaveGameScore()
        {
            string sql = "insert into attempts (player_id, word_id, scorable, scored) values (" 
                + selectedPlayer.Id + ", " 
                + selectedWord.Id + ", " 
                + selectedWord.Text.Length + ", " 
                + score + ")";
            try
            {
                con.Open();
                com = new SqliteCommand(sql, con);
                if (com.ExecuteNonQuery() > 0)
                {
                    string results = "Your Name: " + selectedPlayer.Name + "\n";
                    results += "Word Score: " + selectedWord.Text.Length + "\n";
                    results += "Your Score: " + score;
                    MessageBox.Show(results);
                }
                else
                {
                    MessageBox.Show("Could not save scores", "Error");
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show("Error saving the score: " + ex.Message);
            }
            finally
            {
                if (con != null) con.Close();
            }
        }

        private Player GetPlayer(string name)
        {
            string sql = "select * from players where name = '" + txtPlayer.Text + "'";
            Player player = null;
            try
            {
                con.Open();
                com = new SqliteCommand(sql, con);
                SqliteDataReader r = com.ExecuteReader();
                while (r.Read())
                {
                    player = new Player(r.GetInt64(0), r.GetString(1));
                    break;
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show("Saving the game: " + ex.Message);
            }
            finally
            {
                if (con != null) con.Close();
            }
            return player;
        }

        private bool SavePlayer(string name)
        {
            string sql = "insert into players (name) values ('" + name + "')";
            bool saved = false;
            try
            {
                con.Open();
                com = new SqliteCommand(sql, con);
                int affected = com.ExecuteNonQuery();
                if (affected > 0)
                {
                    saved = true;
                }
            }
            catch
            {
                // do nothing
            }
            finally
            {
                if (con != null) con.Close();
            }
            return saved;
        }

        private void btnScores_Click(object sender, EventArgs e)
        {
            if (scores == null)
            {
                scores = new Scoreboard();
            }
            scores.Show();
        }
    }
}
