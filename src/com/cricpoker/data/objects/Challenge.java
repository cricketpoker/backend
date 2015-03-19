package com.cricpoker.data.objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class hold the database representation 
 * of the Challenge entity
 *
 */
@Entity
@Table(name = "challenges")
public class Challenge {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="challenge_id")
	private int challengeId;
	
	@Column(name="challenge_name")
	private ChallengeType challengeName;

	public int getChallengeId() {
		return challengeId;
	}

	public void setChallengeId(int challengeId) {
		this.challengeId = challengeId;
	}

	public ChallengeType getChallengeName() {
		return challengeName;
	}

	public void setChallengeName(ChallengeType challengeName) {
		this.challengeName = challengeName;
	}
}
