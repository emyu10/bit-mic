using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GuessTheWord
{
    class Attempt
    {
		public Int64 Id { get; set; }
		public Int64 PlayerId { get; set; }
		public Player Player { get; set; }
		public Int64 WordId { get; set; }
		public Word Word { get; set; }
		public DateTime AttempTime { get; private set; }
		public int WordScore { get; set; }
		public int Score { get; set; }

		public void SetAttemptTime(string time)
        {
			this.AttempTime = DateTime.Parse(time);
        }
    }
}
