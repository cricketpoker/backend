package com.cricpoker.data.objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class hold the database representation 
 * of the team entity
 *
 */
@Entity
@Table(name = "teams")
public class Team {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="team_id")
	private int teamId;
	
	@Column(name="team_name")
	private String teamName;
	
	@Column(name="home_city")
	private String homeCity;
	
	@Column(name="team_abbr")
	private String teamAbbreviation;

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getHomeCity() {
		return homeCity;
	}

	public void setHomeCity(String homeCity) {
		this.homeCity = homeCity;
	}

	public String getTeamAbbreviation() {
		return teamAbbreviation;
	}

	public void setTeamAbbreviation(String teamAbbreviation) {
		this.teamAbbreviation = teamAbbreviation;
	}
}
