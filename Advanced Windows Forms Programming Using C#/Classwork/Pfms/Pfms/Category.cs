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

        public static bool Save(string name, char direction)
        {
            var sql = "insert into Category (CategoryName, TransactionDirection) values (@Name, @Direction)";
            try
            {
                conn.Open();
                com = new SqlCommand(sql, conn);
                SqlParameter paramName = new SqlParameter("@Name", name);
                com.Parameters.Add(paramName);
                SqlParameter paramDirection = new SqlParameter("@Direction", direction);
                com.Parameters.Add(paramDirection);

                var result = com.ExecuteNonQuery();
                if (result > 0) return true;
                else return false;
            }
            catch
            {
                return false;
            }
            finally
            {
                if (conn != null) conn.Close();
            }
        }

        public static Category GetById(int id)
        {
            var sql = "select * from Category where CategoryId = @Id";
            try
            {
                conn.Open();
                com = new SqlCommand(sql, conn);

                SqlParameter paramId = new SqlParameter("@Id", id);
                com.Parameters.Add(paramId);

                SqlDataReader reader = com.ExecuteReader();
                if (reader.Read())
                {
                    Category category = new Category();
                    category.Id = reader.GetInt32(0);
                    category.Name = reader.GetString(1);
                    category.TransactionDirection = reader.GetString(2)[0];
                    category.AddedDate = reader.GetDateTime(3);
                    return category;
                }
                else
                {
                    return null;
                }
            }
            catch (Exception ex)
            {
                Debug.WriteLine(ex.Message);
                throw;
            }
            finally
            {
                if (conn != null) conn.Close();
            }
        }

        public static bool Update(int id, string name, char direction)
        {
            var sql = "update Category set CategoryName = @Name, TransactionDirection = @Direction where CategoryId = @Id";
            try
            {
                conn.Open();
                com = new SqlCommand(sql, conn);

                SqlParameter paramName = new SqlParameter("@Name", name);
                com.Parameters.Add(paramName);
                SqlParameter paramDirection = new SqlParameter("@Direction", direction);
                com.Parameters.Add(paramDirection);
                SqlParameter paramId = new SqlParameter("@Id", id);
                com.Parameters.Add(paramId);

                var result = com.ExecuteNonQuery();
                if (result > 0) return true;
                else return false;
            }
            catch
            {
                return false;
            }
            finally
            {
                if (conn != null) conn.Close();
            }
        }

        public static bool Delete(int id)
        {
            var sql = "delete from Category where CategoryId = @Id";
            try
            {
                conn.Open();
                com = new SqlCommand(sql, conn);

                SqlParameter paramId = new SqlParameter("@Id", id);
                com.Parameters.Add(paramId);

                var result = com.ExecuteNonQuery();
                if (result > 0) return true;
                else return false;
            }
            catch
            {
                return false;
            }
            finally
            {
                if (conn != null) conn.Close();
            }
        }
    }
}
