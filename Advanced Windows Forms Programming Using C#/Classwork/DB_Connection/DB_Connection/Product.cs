using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DB_Connection
{
    class Product
    {
        public Int32 Id;
        public string ProductName;
        public decimal Price;

        public Product(Int32 id, string productName, decimal price)
        {
            Id = id;
            ProductName = productName;
            Price = price;
        }

        public override string ToString()
        {
            return ProductName;
        }
    }
}
