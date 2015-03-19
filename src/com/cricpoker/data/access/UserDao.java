package com.cricpoker.data.access;

import org.joda.time.DateTime;

import com.cricpoker.data.objects.User;
import com.cricpoker.util.DatabaseUtil;

public class UserDao {
	
	private final DatabaseUtil dbUtil;
	
	public UserDao() {
		dbUtil = new DatabaseUtil();
	}
	
	public void createUser(DateTime lastLoggedInTime,
			String displayName, int tokensLeft,
			int favTeamId) {
		
		User user = new User();
		user.setDisplayName(displayName);
		user.setFavTeamId(favTeamId);
		user.setLastLoggedInTime(lastLoggedInTime);
		user.setTokensLeft(tokensLeft);
		dbUtil.insert(user);
				
	}

}
