package com.cricpoker.data.parser;

import java.io.FileReader;
import java.io.IOException;

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
				String team1 = teams.split("v")[0].trim();
				String team2 = teams.split("v")[1].trim();
				
				TeamDao teamDao = new TeamDao();
				if((teamDao.listTeamBySingleCriteria("teamName", team1)).isEmpty()) {
					int  teamObj1 = teamDao.createTeam(team1).getTeamId();
				}
				
				if((teamDao.listTeamBySingleCriteria("teamName", team2)).isEmpty()) {
					int  teamObj2 = teamDao.createTeam(team2).getTeamId();
				}
				
				String startTime = nextLine[2];
				String endTime = nextLine[3];
				String venue = nextLine[4];
				
				System.out.println(teams+team1 + startTime + endTime + venue);
				break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
