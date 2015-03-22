package com.cricpoker.data.access;

import java.util.List;

import com.cricpoker.data.objects.Team;	

public class TeamDao extends CommonDao<Team> {
	
	public TeamDao() {
		super(Team.class);
	}
	
	public Team createTeam(String teamName) {
		
		Team team = new Team();
		team.setHomeCity(getTeamCityFromName(teamName));
		team.setTeamAbbreviation(getTeamAbbrFromName(teamName));
		team.setTeamName(teamName);
		
		team = new TeamDao().insert(team);
		
		return team;
		
	}
	
	public List<Team> listTeamBySingleCriteria(String columnName, String columnValue) {
		
		List<Team> teams = new TeamDao().queryByCriteria(columnName, columnValue);
		
		return teams;
	}
	
	public List<Team> listAllTeams() {
		
		List<Team> teams = new TeamDao().queryAll();
		return teams;
	}
	
	private String getTeamAbbrFromName(String teamName) {
		
		String[] initials = teamName.split(" ");
		StringBuilder builder = new StringBuilder();
		
		for(int i=0; i< initials.length ; i++) {
			builder.append(initials[i].charAt(0));
		}
		
		return builder.toString();
	}
	
	private String getTeamCityFromName(String teamName) {
		
		String[] teamCity = teamName.split(" ");
		
		return teamCity[0];
		
	}
}
