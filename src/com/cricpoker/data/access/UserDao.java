package com.cricpoker.data.access;

import java.util.List;

import org.joda.time.DateTime;

import com.cricpoker.data.objects.User;

public class UserDao extends CommonDao<User> {
	
	private final int DEFAULT_TOKENS = 2000;
	
	public UserDao() {
		super(User.class);
	}
	
	public void createUser(DateTime lastLoggedInTime,
			String displayName, int tokensLeft,
			int favTeamId) {
		
		User user = new User();
		user.setDisplayName(displayName);
		user.setFavTeamId(favTeamId);
		user.setLastLoggedInTime(lastLoggedInTime);
		user.setTokensLeft(DEFAULT_TOKENS);
		user = new UserDao().insert(user);
				
	}
	
	public List<User> listUserBySingleCriteria(String columnName, String columnValue) {
		
		List<User> users = new UserDao().queryByCriteria(columnName, columnValue);	
		return users;
	}
	
	public List<User> listAllUsers() {
		
		List<User> users = new UserDao().queryAll();
		return users;
	}

}
