using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CricketQuestionGeneration
{
    public interface IQuestionGenerator
    {
        List<string> Generate();
    }
}
