using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data.SqlClient;

namespace WordsImporterApp
{
    class Program
    {
        private SqlConnection conn = new SqlConnection("Data source = 192.168.122.17; Initial catalog = WordGenerator; User id = sa; password = mql@9933343");

        static void Main(string[] args)
        {
            // provide the path to the sql file which has the insert statements
            string filePath = args[0];

            Program p = new Program();
            p.ReadFromFile(filePath);
            Console.ReadKey();
        }

        // I don't need this method anymore, but I will leave it here for reference
        public void Test()
        {
            try
            {
                conn.Open();
                Console.WriteLine("Connected to the database");
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
        }

        // this is going to be a method to run just one insert statement
        // it opens the connection, runs an insert statement and then close the connection, for each insert statement in the file
        private void RunSingleInsert(string insertQuery)
        {
            try
            {
                conn.Open();
                SqlCommand cmd = new SqlCommand(insertQuery, conn);

                int numRows = cmd.ExecuteNonQuery();
                Console.WriteLine("{0} rows affected.", numRows);
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            finally
            {
                if (conn != null)
                {
                    conn.Close();
                }
            }
        }

        // now i need a way to read a file line by line when the file path is provided
        public void ReadFromFile(string filePath)
        {
            string[] lines = System.IO.File.ReadAllLines(filePath);
            foreach (string query in lines)
            {
                RunSingleInsert(query);
            }
        }
    }
}
