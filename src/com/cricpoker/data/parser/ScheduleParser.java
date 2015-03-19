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
				if (lineCount == 0) {
					continue;
				}
				lineCount++;
				System.out.println(nextLine[0] + nextLine[2] + nextLine[3]
						+ nextLine[4] + "etc...");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
