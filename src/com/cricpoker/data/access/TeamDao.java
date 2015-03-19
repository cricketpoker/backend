package com.cricpoker.data.access;

import java.util.List;

import com.cricpoker.data.objects.Team;

public class TeamDao extends CommonDao<Team> {
	
	public TeamDao() {
		super(Team.class);
	}
	
	public void createTeam(String teamName,
			String homeCity, String teamAbbr) {
		
		Team team = new Team();
		team.setHomeCity(homeCity);
		team.setTeamAbbreviation(teamAbbr);
		team.setTeamName(teamName);
		new TeamDao().insert(team);	
		
	}
	
	public List<Team> listUserBySingleCriteria(String columnName, String columnValue) {
		
		List<Team> teams = new UserDao().queryByCriteria(columnName, columnValue);
		
		return teams;
	}
}
