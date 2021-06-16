using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data.SqlClient;

namespace Pfms
{
    class Model
    {
        protected static SqlConnection conn = new SqlConnection("Data source = 192.168.122.17; Initial catalog = PfmsDb; User id = sa; Password = mql@9933343");
        protected static SqlCommand com;
    }
}
