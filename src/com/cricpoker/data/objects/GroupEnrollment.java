package com.cricpoker.data.objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * This class hold the database representation 
 * of the group enrollment entity
 *
 */
@Entity
@Table(name = "user_groups")
public class GroupEnrollment {
	
	@Column(name="user_id")
	private int user_id;
	
	@Column(name="group_id")
	private int group_id;
	
	@Column(name="is_pending")
	private boolean is_pending;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getGroup_id() {
		return group_id;
	}

	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}

	public boolean isIs_pending() {
		return is_pending;
	}

	public void setIs_pending(boolean is_pending) {
		this.is_pending = is_pending;
	}

}
