using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GuessTheWord
{
    class Word
    {
        public Int64 Id { get; set; }
        public string Text { get; set; }

        public Word(Int64 id, string text)
        {
            Id = id;
            Text = text;
        }
    }
}
