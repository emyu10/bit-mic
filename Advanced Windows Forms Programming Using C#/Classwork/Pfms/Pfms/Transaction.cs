using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data;
using System.Data.SqlClient;

namespace Pfms
{
    public class Transaction : Model
    {
        /*
            TransactionId
            AccountId
            AccountTitle
            CategoryId
            CategoryName
            TransactionDirection
            Amount
            TransactionDetails
            InvolvedPersonId
            PersonName
            PersonFriendlyName
            TransactionDate
            AddedDate
        */
        public int Id;
        public int AccountId;
        public string AccountTitle;
        public int CategoryId;
        public string CategoryName;
        public char TransactionDirection;
        public decimal Amount;
        public string Details;
        public int PersonId;
        public string PersonName;
        public string PersonFriendlyName;
        public DateTime TransactionDate;
        public DateTime AddedDate;

        public static bool Save(Account account, Category category, decimal amount, string details, DateTime transactionDate, int personId = -1)
        {
            if (category.TransactionDirection == '+' && account.MaxAmount != -1)
            {
                var resulting = account.CurrentBalance + amount;
                if (resulting > account.MaxAmount)
                {
                    throw new InvalidOperationException("This amount cannot be added to this account");
                }
            }

            if (category.TransactionDirection == '-' && account.MinAmount != -1)
            {
                var resulting = account.CurrentBalance - amount;
                if (resulting < account.MinAmount)
                {
                    throw new InvalidOperationException("This amount cannot be withdrawn from this account");
                }
            }
            var sql = "insert into [Transaction] (AccountId, CategoryId, Amount, TransactionDetails, TransactionDate";
            if (personId != -1)
            {
                sql += ", InvolvedPersonId";
            }
            sql += ") values (@AccountId, @CategoryId, @Amount, @TransactionDetails, @TransactionDate";
            if (personId != -1)
            {
                sql += ", @PersonId";
            }
            sql += ")";

            try
            {
                conn.Open();
                SqlParameter paramAccountId = new SqlParameter("@AccountId", account.Id);
                SqlParameter paramCategoryId = new SqlParameter("@CategoryId", category.Id);
                SqlParameter paramAmount = new SqlParameter("@Amount", amount);
                SqlParameter paramDetails = new SqlParameter("@TransactionDetails", details);
                SqlParameter paramTransactionDate = new SqlParameter("@TransactionDate", transactionDate);
                SqlParameter paramPersonId = new SqlParameter("@PersonId", personId);

                com = new SqlCommand(sql, conn);
                com.Parameters.AddRange(new [] { paramAccountId, paramCategoryId, paramAmount, paramDetails, paramTransactionDate, paramPersonId });
                var result = com.ExecuteNonQuery();
                return result > 0;
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

        public static DataTable GetByAccount(Account account)
        {
            var sql = "select TransactionId, CategoryName, TransactionDirection as Direction, Amount, TransactionDetails as Details, PersonName, TransactionDate as [Date] from TransactionDetails where AccountId = @AccountId";
            var adapter = new SqlDataAdapter();
            DataSet transactions = new DataSet();
            try
            {
                conn.Open();
                com = new SqlCommand(sql, conn);

                SqlParameter paramAccountId = new SqlParameter("@AccountId", account.Id);
                com.Parameters.Add(paramAccountId);

                adapter.SelectCommand = com;
                adapter.Fill(transactions, "Transactions");
                adapter.Dispose();
                return transactions.Tables[0];
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

        public static Transaction GetById(int id)
        {
            var sql = "select * from TransactionDetails where TransactionId = @Id";

            try
            {
                conn.Open();
                com = new SqlCommand(sql, conn);

                SqlParameter paramId = new SqlParameter("@Id", id);
                com.Parameters.Add(paramId);

                var reader = com.ExecuteReader();
                if (reader.Read())
                {
                    var trans = new Transaction();
                    trans.Id = reader.GetInt32(0);
                    trans.AccountId = reader.GetInt32(1);
                    trans.AccountTitle = reader.GetString(2);
                    trans.CategoryId = reader.GetInt32(3);
                    trans.CategoryName = reader.GetString(4);
                    trans.TransactionDirection = reader.GetString(5)[0];
                    trans.Amount = reader.GetDecimal(6);
                    trans.Details = reader.GetString(7);
                    trans.PersonId = reader.IsDBNull(8) ? -1 : reader.GetInt32(8);
                    trans.PersonName = reader.IsDBNull(9) ? null : reader.GetString(9);
                    trans.PersonFriendlyName = reader.IsDBNull(10) ? null : reader.GetString(10);
                    trans.TransactionDate = reader.GetDateTime(11);
                    trans.AddedDate = reader.GetDateTime(12);
                    return trans;
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
            var sql = "delete from [Transaction] where TransactionId = @Id";
            try
            {
                conn.Open();
                com = new SqlCommand(sql, conn);

                SqlParameter paramId = new SqlParameter("@Id", id);
                com.Parameters.Add(paramId);

                return com.ExecuteNonQuery() > 0;
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
