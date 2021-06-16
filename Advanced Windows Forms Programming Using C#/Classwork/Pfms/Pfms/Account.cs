using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data.SqlClient;

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
                    account.ParentId = r.IsDBNull(3) ? 0 : r.GetInt32(3);
                    account.MaxAmount = r.IsDBNull(4) ? 0 : r.GetDecimal(4);
                    account.MinAmount = r.IsDBNull(5) ? 0 : r.GetDecimal(5);
                    account.CurrentBalance = r.IsDBNull(6) ? 0 : r.GetDecimal(6);
                    account.AddedDate = r.GetDateTime(7);
                    accounts.Add(account);
                }
            }
            catch (Exception ex)
            {
                throw;
            }
            return accounts;
        }
    }
}
