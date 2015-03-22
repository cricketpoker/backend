package com.cricpoker.data.access;

import org.joda.time.DateTime;
 
public class Test {

 public static void main(String[] args) {
   
  Test tst = new Test();
  tst.addUser("Soham", new DateTime(), 2000, 1);
 }
 
 private void addUser(String displayName, DateTime lastLoggedIn, int tokensLeft, int favTeamId) {
	 
	 UserDao userDao = new UserDao();
	 TeamDao temaDao = new TeamDao();
	 
	 temaDao.createTeam("Hello World");
	 //userDao.createUser(lastLoggedIn, displayName, tokensLeft, favTeamId);
	 
	// System.out.println(userDao.listUserBySingleCriteria("displayName", "Ketki%"));
	 
	 //System.out.println(userDao.listAllUsers());
 }

}
