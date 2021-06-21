using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data.SqlClient;
using System.Data;
using System.Diagnostics;

namespace Pfms
{
    public class Person : Model
    {
        public int Id;
        public string Name;
        public string FriendlyName;
        public string ContactNumber;
        public DateTime AddedDate;

        public static DataTable GetAllPersons()
        {
            var sql = "select * from Person";
            var adapter = new SqlDataAdapter();
            DataSet persons = new DataSet();

            try
            {
                conn.Open();
                com = new SqlCommand(sql, conn);
                adapter.SelectCommand = com;
                adapter.Fill(persons, "Person");
                adapter.Dispose();
                return persons.Tables[0];
            }
            catch
            {
                throw;
            }
            finally
            {
                if (conn != null) conn.Close();
            }
        }
    }
}
