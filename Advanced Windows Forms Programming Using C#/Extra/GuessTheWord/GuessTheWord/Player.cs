using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GuessTheWord
{
    class Player
    {
        public Int64 Id { get; set; }
        public string Name { get; set; }

        public Player(Int64 id, string name)
        {
            Id = id;
            Name = name;
        }
    }
}
