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
    class Account : Model
    {
        public int Id { get; set; }
        public string Title { get; set; }
        public string Description { get; set; }
        public int ParentId { get; set; }
        public decimal MaxAmount { get; set; }
        public decimal MinAmount { get; set; }
        public decimal CurrentBalance { get; set; }
        public DateTime AddedDate { get; set; }

        public string Info()
        {
            string bal = this.CurrentBalance == -1 ? "N/A" : this.CurrentBalance.ToString("0.00");
            return String.Format("{0} [{1}]", this.Title, bal);
        }
        public static List<Account> GetAllAccounts()
        {
            List<Account> accounts = new List<Account>();
            var sql = "select * from Account";
            try
            {
                conn.Open();
                com = new SqlCommand(sql, conn);
                SqlDataReader r = com.ExecuteReader();
                
                while (r.Read())
                {
                    Account account = new Account();
                    account.Id = r.GetInt32(0);
                    account.Title = r.GetString(1);
                    account.Description = r.IsDBNull(2) ? "" : r.GetString(2);
                    account.ParentId = r.IsDBNull(3) ? -1 : r.GetInt32(3);
                    account.MaxAmount = r.IsDBNull(4) ? -1 : r.GetDecimal(4);
                    account.MinAmount = r.IsDBNull(5) ? -1 : r.GetDecimal(5);
                    account.CurrentBalance = r.IsDBNull(6) ? -1 : r.GetDecimal(6);
                    account.AddedDate = r.GetDateTime(7);
                    accounts.Add(account);
                }
                conn.Close();
            }
            catch
            {
                throw;
            }
            
            return accounts;
        }

        //public static DataSet GetAllAccount()
        //{
        //    var sql = "select * from Account";
        //    var adapter = new SqlDataAdapter();
        //    DataSet accounts = new DataSet();
        //    //DataView
        //    try
        //    {
        //        conn.Open();
        //        com = new SqlCommand(sql, conn);
        //        adapter.SelectCommand = com;
        //        adapter.Fill(accounts, "Account");
        //        adapter.Dispose();
        //        conn.Close();
        //    }
        //    catch
        //    {
        //        throw;
        //    }
        //    return accounts;
        //}

        public static bool Save(string title, string description = null, int parentId = -1, decimal max = 0, decimal min = 0, decimal balance = 0)
        {
            Debug.WriteLine("title: " + title + ", description: " + description + ", parentId: " + parentId + ", max: " + max + ", min: " + min + ", balance: " + balance);
            var sql = "insert into Account (AccountTitle, AccountDescription ";
            if (parentId != -1) sql += ", ParentId ";
            if (max != 0) sql += ", MaxAmount ";
            if (min != 0) sql += ", MinAmount ";
            if (balance != 0) sql += ", CurrentBalance";
            sql += " ) values (@Title, @Description ";
            if (parentId != -1) sql += ", @ParentId";
            if (max != 0) sql += ", @Max";
            if (min != 0) sql += ", @Min";
            if (balance != 0) sql += ", @Balance";
            sql += ")";
            Debug.WriteLine(sql);
            List<SqlParameter> parameters = new List<SqlParameter>();
            SqlParameter paramTitle = new SqlParameter("@Title", title);
            SqlParameter paramDescription = new SqlParameter("@Description", description);
            parameters.AddRange(new[] { paramTitle, paramDescription });

            if (parentId != -1) {
                SqlParameter paramParentId = new SqlParameter("@ParentId", parentId);
                parameters.Add(paramParentId);
            }
            if (max != 0)
            {
                SqlParameter paramMax = new SqlParameter("@Max", max);
                parameters.Add(paramMax);
            }
            if (min != 0)
            {
                SqlParameter paramMin = new SqlParameter("@Min", min);
                parameters.Add(paramMin);
            }
            if (balance != 0)
            {
                SqlParameter paramBalance = new SqlParameter("@Balance", balance);
                parameters.Add(paramBalance);
            }
            try
            {
                conn.Open();
                com = new SqlCommand(sql, conn);
                com.Parameters.AddRange(parameters.ToArray());
                var result = com.ExecuteNonQuery();
                conn.Close();
                if (result > 0)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
            catch (Exception ex)
            {
                Debug.WriteLine(ex.Message);
                return false;
            }
        }

        public static Account GetAccountById(int id)
        {
            var account = new Account();
            try
            {
                conn.Open();
                var sql = "select * from Account where AccountId = @Id";
                SqlParameter paramId = new SqlParameter("@Id", id);
                com = new SqlCommand(sql, conn);
                com.Parameters.Add(paramId);
                SqlDataReader reader = com.ExecuteReader();
                if (reader.Read())
                {
                    account.Id = reader.GetInt32(0);
                    account.Title = reader.GetString(1);
                    account.Description = reader.IsDBNull(2) ? "" : reader.GetString(2);
                    account.ParentId = reader.IsDBNull(3) ? -1 : reader.GetInt32(3);
                    account.MaxAmount = reader.IsDBNull(4) ? -1 : reader.GetDecimal(4);
                    account.MinAmount = reader.IsDBNull(5) ? -1 : reader.GetDecimal(5);
                    account.CurrentBalance = reader.IsDBNull(6) ? -1 : reader.GetDecimal(6);
                    account.AddedDate = reader.GetDateTime(7);
                }
                conn.Close();
            }
            catch
            {
                throw;
            }
            finally
            {
                if (conn != null) conn.Close();
            }
            return account;
        }
    }
}
