using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CricketQuestionGeneration
{
    internal class Player
    {
        internal string Name;
        internal PlayerType Type;
        internal int Runs;
        internal int Wickets;
        internal int NoOfSixes;
        internal int NoOfFours;

        internal Player(string name, PlayerType playerType, int runs, int wickets, int noOfSixes, int noOfFours)
        {
            Name = name;
            Type = playerType;
            Runs = runs;
            Wickets = wickets;
            NoOfSixes = noOfSixes;
            NoOfFours = noOfFours;
        }
    }
}
