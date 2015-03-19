package com.cricpoker.data.access;

import org.joda.time.DateTime;

import com.cricpoker.data.objects.User;

public class UserDao extends CommonDao<User> {
	
	public UserDao() {
		super();
	}
	
	public void createUser(DateTime lastLoggedInTime,
			String displayName, int tokensLeft,
			int favTeamId) {
		
		User user = new User();
		user.setDisplayName(displayName);
		user.setFavTeamId(favTeamId);
		user.setLastLoggedInTime(lastLoggedInTime);
		user.setTokensLeft(tokensLeft);
		new UserDao().insert(user);
				
	}

}
