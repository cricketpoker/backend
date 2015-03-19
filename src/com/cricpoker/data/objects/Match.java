package com.cricpoker.data.objects;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.joda.time.DateTime;

/**
 * This class hold the database representation 
 * of the Match entity
 *
 */
@Entity
@Table(name = "matches")
public class Match {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="match_id")
	private int matchId;
	
	@Column(name="team_id1")
	private int teamId1;
	
	@Column(name="team_id1")
	private int teamId2;
	
	@Column(name="ground")
	private String ground;
	
	@Column(name="venue")
	private String venue;
	
	@Column(name="winning_team_id")
	private int winningTeamId;
	
	@Column(name="match_date")
	private Date matchDate;

	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public int getTeamId1() {
		return teamId1;
	}

	public void setTeamId1(int teamId1) {
		this.teamId1 = teamId1;
	}

	public int getTeamId2() {
		return teamId2;
	}

	public void setTeamId2(int teamId2) {
		this.teamId2 = teamId2;
	}

	public String getGround() {
		return ground;
	}

	public void setGround(String ground) {
		this.ground = ground;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public int getWinningTeamId() {
		return winningTeamId;
	}

	public void setWinningTeamId(int winningTeamId) {
		this.winningTeamId = winningTeamId;
	}

	public DateTime getMatchDate() {
		return new DateTime(matchDate);
	}

	public void setMatchDate(DateTime matchDate) {
		this.matchDate = new Date(matchDate.getMillis());
	}

}
