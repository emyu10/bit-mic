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
    public partial class Scoreboard : Form
    {
        private SqliteConnection con = new SqliteConnection("Data source = guess_the_word.db");
        private SqliteCommand com = new SqliteCommand();

        public Scoreboard()
        {
            InitializeComponent();
        }

        

        private void Scoreboard_Load(object sender, EventArgs e)
        {
            GenerateAllGames();
            GenerateTotals();
        }

        private ArrayList GetAllGames()
        {
            ArrayList attempts = new ArrayList();

            string sql = "select " +
            "a.id, " + // 0
	        "a.player_id, " + // 1
	        "p.name, " + // 2
	        "a.word_id, " + // 3
	        "w.word, " + // 4
	        "a.attempt_time, " + // 5
            "a.scorable, " + // 6
            "a.scored " + // 7
            "from attempts a " +
            "left join players p on a.player_id = p.id " +
            "left join words w on a.word_id = w.id " +
            "order by attempt_time desc";

            try
            {
                con.Open();
                com = new SqliteCommand(sql, con);
                SqliteDataReader r = com.ExecuteReader();

                while (r.Read())
                {
                    var attempt = new Attempt();
                    attempt.Id = r.GetInt64(0);
                    attempt.PlayerId = r.GetInt64(1);
                    var player = new Player(r.GetInt64(1), r.GetString(2));
                    attempt.Player = player;
                    attempt.WordId = r.GetInt64(3);
                    var word = new Word(r.GetInt64(3), r.GetString(4));
                    attempt.Word = word;
                    attempt.SetAttemptTime(r.GetString(5));
                    attempt.WordScore =  r.GetInt16(6);
                    attempt.Score = r.GetInt16(7);
                    attempts.Add(attempt);
                }
                r.Close();
            }
            catch (Exception e)
            {
                //MessageBox.Show(e.Message);
                // do nothing
            }
            finally
            {
                if (con != null) con.Close();
            }

            return attempts;
        }

        private void GenerateAllGames()
        {
            var attempts = GetAllGames();
            
            foreach (Attempt attempt in attempts)
            {
                string item = attempt.Player.Name + "\t\t" +
                    attempt.Word.Text + "\t\t" +
                    attempt.AttempTime + "\t\t" +
                    attempt.Score + "/" +
                    attempt.WordScore;
                lbxAllGames.Items.Add(item);
            }
        }

        private void GenerateTotals()
        {
            string sql = "select " +
            "sums.player_id, " +
	        "p.name, " +
	        "sums.scored_sum, " +
	        "sums.word_sum " +
            "from( " +
            "select player_id, sum(scored) as scored_sum, sum(scorable) as word_sum from attempts group by player_id " +
            ") sums " +
            "left join players p on sums.player_id = p.id";

            try
            {
                con.Open();
                com = new SqliteCommand(sql, con);
                SqliteDataReader r = com.ExecuteReader();

                while (r.Read())
                {
                    string item = r.GetString(1); // player name
                    item += "\t\t" + r.GetInt16(2) + "/" + r.GetInt16(3);
                    lbxPlayerTotals.Items.Add(item);
                }
                r.Close();
            }
            catch
            {
                // do nothing
            }
            finally
            {
                if (con != null) con.Close();
            }
        }
    }
}
