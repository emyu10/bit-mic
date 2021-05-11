using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DB_Connection
{
    class Customer
    {
        /*
        Id
        Name
        Phone
        Email
        Address
        */
        public Int32 Id;
        public string Name;
        public string Phone;
        public string Email;
        public string Address;

        public Customer(Int32 id, string name, string phone, string email, string address)
        {
            Id = id;
            Name = name;
            Phone = phone;
            Email = email;
            Address = address;
        }

        public override string ToString()
        {
            return Name;
        }
    }
}
