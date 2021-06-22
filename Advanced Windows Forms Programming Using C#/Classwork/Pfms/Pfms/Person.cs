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

        public static bool Save(string name, string friendlyName, string contactNumber)
        {
            var sql = "insert into Person (Name, FriendlyName, ContactNo) values (@Name, @FriendlyName, @ContactNo)";
            try
            {
                conn.Open();
                com = new SqlCommand(sql, conn);
                SqlParameter paramName = new SqlParameter("@Name", name);
                com.Parameters.Add(paramName);
                SqlParameter paramFriendlyName = new SqlParameter("@FriendlyName", friendlyName);
                com.Parameters.Add(paramFriendlyName);
                SqlParameter paramContactNo = new SqlParameter("@ContactNo", contactNumber);
                com.Parameters.Add(paramContactNo);

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

        public static bool Update(int id, string name, string friendlyName, string contactNumber)
        {
            var sql = "update Person set Name = @Name, FriendlyName = @FriendlyName, ContactNo = @ContactNo where PersonId = @Id";
            try
            {
                conn.Open();
                com = new SqlCommand(sql, conn);
                
                SqlParameter paramName = new SqlParameter("@Name", name);
                com.Parameters.Add(paramName);
                SqlParameter paramFriendlyName = new SqlParameter("@FriendlyName", friendlyName);
                com.Parameters.Add(paramFriendlyName);
                SqlParameter paramContactNo = new SqlParameter("@ContactNo", contactNumber);
                com.Parameters.Add(paramContactNo);
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

        public static Person GetById(int id)
        {
            var sql = "select * from Person where PersonId = @Id";
            try
            {
                conn.Open();
                com = new SqlCommand(sql, conn);

                SqlParameter paramId = new SqlParameter("@Id", id);
                com.Parameters.Add(paramId);

                SqlDataReader reader = com.ExecuteReader();
                if (reader.Read())
                {
                    Person person = new Person();
                    person.Id = reader.GetInt32(0);
                    person.Name = reader.GetString(1);
                    person.FriendlyName = reader.GetString(2);
                    person.ContactNumber = reader.GetString(3);
                    person.AddedDate = reader.GetDateTime(4);
                    return person;
                }
                else
                {
                    return null;
                }
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

        public static bool Delete(int id)
        {
            var sql = "delete from Person where PersonId = @Id";
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
