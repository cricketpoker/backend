package com.cricpoker.data.parser;

import java.io.FileReader;
import java.io.IOException;

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
				
				String summary = nextLine[0];
				String startTime = nextLine[2];
				String endTime = nextLine[3];
				String venue = nextLine[4];
				
				System.out.println(summary + startTime + endTime + venue);
				break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
