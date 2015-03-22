package com.cricpoker.data.parser;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.cricpoker.data.access.MatchDao;
import com.cricpoker.data.access.TeamDao;
import com.cricpoker.data.objects.Team;
import com.opencsv.CSVReader;

public class ScheduleParser {

	public static void main(String args[]) {

		CSVReader reader;
		try {
			reader = new CSVReader(new FileReader(
					"./resouces/Pepsi_Indian_Premier_League.csv"));
			int lineCount = 0;
			String[] nextLine;
			while ((nextLine = reader.readNext()) != null) {
				lineCount++;
				if (lineCount == 1) {
					continue;
				}
				
				String teams = nextLine[0].split("match")[1].trim();
				String team1 = teams.split("v ")[0].trim();
				String team2 = teams.split("v ")[1].trim();
				
				TeamDao teamDao = new TeamDao();
				int  teamId1;
				List<Team> team1Obj = teamDao.listTeamBySingleCriteria("teamName", team1);
				if(team1Obj.isEmpty()) {
					teamId1 = teamDao.createTeam(team1).getTeamId();
				} else {
					teamId1 = team1Obj.get(0).getTeamId();
				}
				
				int  teamId2;
				List<Team> team2Obj = teamDao.listTeamBySingleCriteria("teamName", team2);
				if((teamDao.listTeamBySingleCriteria("teamName", team2)).isEmpty()) {
					teamId2 = teamDao.createTeam(team2).getTeamId();
				} else {
					teamId2 = team2Obj.get(0).getTeamId();
				}
				
				String startTime = nextLine[2];
				DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
				DateTime matchDate = formatter.parseDateTime(startTime.substring(0, startTime.length()-6));
				String venue[] = nextLine[4].split(",");
				
				String ground = venue[0];
				String city = venue[1];
				if(venue.length == 3) {
					city +="," +venue[2];
				}
				
				MatchDao matchDao = new MatchDao();
				matchDao.createMatch(teamId1, teamId2, ground, city, matchDate);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
