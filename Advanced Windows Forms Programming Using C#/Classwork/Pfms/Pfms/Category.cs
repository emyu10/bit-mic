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
    public class Category : Model
    {
        public int Id;
        public string Name;
        public char TransactionDirection;
        public DateTime AddedDate;

        public static DataTable GetAllCategories()
        {
            var sql = "select * from Category";
            var adapter = new SqlDataAdapter();
            DataSet categories = new DataSet();
 
            try
            {
                conn.Open();
                com = new SqlCommand(sql, conn);
                adapter.SelectCommand = com;
                adapter.Fill(categories, "Category");
                adapter.Dispose();
                return categories.Tables[0];
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
