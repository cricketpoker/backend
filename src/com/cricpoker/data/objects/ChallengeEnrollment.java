package com.cricpoker.data.objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class hold the database representation 
 * of the challenge enrollment entity
 *
 */
@Entity
@Table(name = "user_group_challenges")
public class ChallengeEnrollment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="enrollment_id")
	private int enrollmentId;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="group_id")
	private int groupId;
	
	@Column(name="challenge_id")
	private int challengeId;

	public int getEnrollmentId() {
		return enrollmentId;
	}

	public void setEnrollmentId(int enrollmentId) {
		this.enrollmentId = enrollmentId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public int getChallengeId() {
		return challengeId;
	}

	public void setChallengeId(int challengeId) {
		this.challengeId = challengeId;
	}
}
