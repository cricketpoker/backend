package com.cricpoker.data.access;

import java.util.List;

import org.joda.time.DateTime;

import com.cricpoker.data.objects.Match;

public class MatchDao extends CommonDao<Match>{

	public MatchDao() {
		super(Match.class);
	}
	
	public Match createMatch(int teamId1, int teamId2, String ground, String venue,
			DateTime matchDate) {
		
		Match match = new Match();
		match.setTeamId1(teamId1);
		match.setTeamId2(teamId2);
		match.setGround(ground);
		match.setVenue(venue);
		match.setMatchDate(matchDate);
		
		match = new MatchDao().insert(match);		
		return match;
		
	}
	
	public List<Match> listMatchBySingleCriteria(String columnName, String columnValue) {
		
		List<Match> matches = new MatchDao().queryByCriteria(columnName, columnValue);
		
		return matches;
	}
	
	public List<Match> listAllMatches() {
		
		List<Match> matches = new MatchDao().queryAll();
		return matches;
	}
}
