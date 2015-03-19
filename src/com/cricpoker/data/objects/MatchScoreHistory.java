package com.cricpoker.data.objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class hold the database representation 
 * of the score history entity
 *
 */
@Entity
@Table(name = "user_match_score_history")
public class MatchScoreHistory {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="history_id")
	private int historyId;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="match_id")
	private int matchId;
	
	@Column(name="points_before")
	private int pointsBefore;
	
	@Column(name="points_won")
	private int pointsWon;
	
	@Column(name="normalization_factor")
	private float normalizationFactor;

	public int getHistoryId() {
		return historyId;
	}

	public void setHistoryId(int historyId) {
		this.historyId = historyId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public int getPointsBefore() {
		return pointsBefore;
	}

	public void setPointsBefore(int pointsBefore) {
		this.pointsBefore = pointsBefore;
	}

	public int getPointsWon() {
		return pointsWon;
	}

	public void setPointsWon(int pointsWon) {
		this.pointsWon = pointsWon;
	}

	public float getNormalizationFactor() {
		return normalizationFactor;
	}

	public void setNormalizationFactor(float normalizationFactor) {
		this.normalizationFactor = normalizationFactor;
	}
}
