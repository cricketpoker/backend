using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CricketQuestionGeneration
{
    internal class TemplateQuestionGenerator : IQuestionGenerator
    {
        private List<Player> Players;
        Random random = new Random();

        internal TemplateQuestionGenerator(List<Player> players)
        {
            Players = players;
        }

        public List<string> Generate()
        {
            var questions = new List<string>();
            foreach (var template in GenerateTemplates())
            {
                var question = GenerateQuestion(template);
                questions.Add(question);
            }

            return questions;
        }

        private string GenerateQuestion(QuestionTemplate template)
        {
            var question = template.QuestionFormat;

            var replacementResults = new Dictionary<int, string>();
            var selectedPlayers = new List<Player>();
            foreach (var item in template.ReplacementMap)
            {
                int replacementIndex = item.Key;
                string replacementValue = string.Empty;
                List<Player> players;
                Player player;

                switch (item.Value)
                {
                    case PlayerType.Batsman:
                        players = Players.Where(p => p.Type.HasFlag(PlayerType.Batsman) && !selectedPlayers.Contains(p)).ToList();
                        player = players[random.Next(0, players.Count)];
                        if (player != null)
                        {
                            replacementValue = player.Name;
                            selectedPlayers.Add(player);
                        }
                        break;
                    case PlayerType.Bowler:
                        players = Players.Where(p => p.Type.HasFlag(PlayerType.Bowler) && !selectedPlayers.Contains(p)).ToList();
                        player = players[random.Next(0, players.Count)];
                        if (player != null)
                        {
                            replacementValue = player.Name;
                            selectedPlayers.Add(player);
                        }
                        break;
                    case PlayerType.AllRounder:
                        players = Players.Where(p => p.Type.HasFlag(PlayerType.AllRounder) && !selectedPlayers.Contains(p)).ToList();
                        player = players[random.Next(0, players.Count)];
                        if (player != null)
                        {
                            replacementValue = player.Name;
                            selectedPlayers.Add(player);
                        }
                        break;
                    default:
                        break;
                }

                replacementResults.Add(replacementIndex, replacementValue);
            }

            foreach (var item in replacementResults)
                question = question.Replace("{" + item.Key + "}", item.Value);

            return question;
        }

        private static IEnumerable<QuestionTemplate> GenerateTemplates()
        {
            QuestionTemplate questionTemplate;
            Dictionary<int, PlayerType> replacementMap = new Dictionary<int, PlayerType>();

            replacementMap.Add(0, PlayerType.Batsman);
            questionTemplate = new QuestionTemplate("How many runs will {0} score?", replacementMap);
            yield return questionTemplate;

            replacementMap = new Dictionary<int, PlayerType>();
            replacementMap.Add(0, PlayerType.Bowler);
            questionTemplate = new QuestionTemplate("How many wickets will {0} take?", replacementMap);
            yield return questionTemplate;

            replacementMap = new Dictionary<int, PlayerType>();
            replacementMap.Add(0, PlayerType.Batsman);
            replacementMap.Add(1, PlayerType.Bowler);
            questionTemplate = new QuestionTemplate("How many sixes will {0} score against {1} ?", replacementMap);
            yield return questionTemplate;

            replacementMap = new Dictionary<int, PlayerType>();
            replacementMap.Add(0, PlayerType.AllRounder);
            questionTemplate = new QuestionTemplate("Will {0} be the best all-rounder today?", replacementMap);
            yield return questionTemplate;
        }
    }
}
