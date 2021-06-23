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
    }
}
