using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CricketQuestionGeneration
{
    public class Program
    {
        public static void Main(string[] args)
        {

            var players = new List<Player>();
            players.Add(new Player("Sachin Tendulkar", PlayerType.Batsman, 999, 10, 100, 200));
            players.Add(new Player("Rohit Sharma", PlayerType.Batsman, 999, 10, 100, 200));
            players.Add(new Player("rahul Dravid", PlayerType.Batsman, 777, 0, 40, 250));
            players.Add(new Player("Aaron Finch", PlayerType.Batsman, 777, 0, 40, 250));

            players.Add(new Player("Yuyraj Singh", PlayerType.AllRounder, 700, 70, 80, 150));
            players.Add(new Player("Chris Gayle", PlayerType.AllRounder, 700, 70, 80, 150));

            players.Add(new Player("Zaheer Khan", PlayerType.Bowler, 50, 100, 10, 4));
            players.Add(new Player("Dale Steyn", PlayerType.Bowler, 50, 100, 10, 4));
            players.Add(new Player("Mohammed Shami", PlayerType.Bowler, 50, 100, 10, 4));


            var generators = new List<IQuestionGenerator>();
            generators.Add(new TemplateQuestionGenerator(players));

            var questions = new List<string>();
            foreach (var generator in generators)
            {
                var ques = generator.Generate();
                foreach (var q in ques)
                {
                    Console.WriteLine(q);
                }
            }
        }
    }
}
