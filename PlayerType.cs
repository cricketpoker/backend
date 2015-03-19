using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CricketQuestionGeneration
{
    [Flags]
    internal enum PlayerType
    {
        Batsman = 0x1,
        Bowler = 0x2,
        WicketKeeper = 0x4,
        AllRounder = Batsman | Bowler,
        WicketKeeperBatsman = WicketKeeper | Batsman,
    }
}
