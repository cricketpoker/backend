package com.cricpoker.data.objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class hold the database representation 
 * of the player entity
 *
 */
@Entity
@Table(name = "players")
public class Player {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="player_id")
	private int playerId;
	
	@Column(name="player_name")
	private String playerName;
	
	@Column(name="current_team_id")
	private int currentTeamId;

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getCurrentTeamId() {
		return currentTeamId;
	}

	public void setCurrentTeamId(int currentTeamId) {
		this.currentTeamId = currentTeamId;
	}
}
