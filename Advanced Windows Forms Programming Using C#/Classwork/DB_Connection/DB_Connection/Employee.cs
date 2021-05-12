using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DB_Connection
{
    class Employee
    {
        public Int32 Id;
        public string Name;
        public string Username;
        public string Email;
        public string Password;
        public bool Active;

        public Employee(Int32 Id, string Name, string Username, string Email)
        {
            this.Id = Id;
            this.Name = Name;
            this.Username = Username;
            this.Email = Email;
        }
        
        public override string ToString()
        {
            return this.Name;
        }
    }
}
