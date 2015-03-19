using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CricketQuestionGeneration
{
    internal sealed class QuestionTemplate
    {
        internal string QuestionFormat { get; private set; }
        internal Dictionary<int, PlayerType> ReplacementMap { get; private set; }

        internal QuestionTemplate(string format, Dictionary<int, PlayerType> replacementMap)
        {
            QuestionFormat = format;
            ReplacementMap = replacementMap;
        }
    }
}
