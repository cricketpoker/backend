package com.cricpoker.data.access;

import com.cricpoker.data.objects.Team;

public class TeamDao extends CommonDao<Team> {
	
	public TeamDao() {
		super();
	}
	
	public void createTeam(String teamName,
			String homeCity, String teamAbbr) {
		
		Team team = new Team();
		team.setHomeCity(homeCity);
		team.setTeamAbbreviation(teamAbbr);
		team.setTeamName(teamName);
		new TeamDao().insert(team);	
		
	}
}
