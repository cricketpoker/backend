package com.cricpoker.data.access;

import org.joda.time.DateTime;
 
public class Test {

 public static void main(String[] args) {
   
  Test tst = new Test();
  tst.addUser("Saranga", new DateTime(), 2000, 1);
 }
 
 private void addUser(String displayName, DateTime lastLoggedIn, int tokensLeft, int favTeamId) {
	 
	 UserDao userDao = new UserDao();
	 userDao.createUser(lastLoggedIn, displayName, tokensLeft, favTeamId);
 }

}
