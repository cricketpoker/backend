package com.cricpoker.data.objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class hold the database representation 
 * of the user's badge entity
 *
 */
@Entity
@Table(name = "user_badges")
public class Badge {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_badge_id")
	private int userBadgeId;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="badge_resource_link")
	private String url;

	public int getUserBadgeId() {
		return userBadgeId;
	}

	public void setUserBadgeId(int userBadgeId) {
		this.userBadgeId = userBadgeId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
