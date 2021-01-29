package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class JetsApplication {
	private final Scanner kb = new Scanner(System.in);

	public void run() {
		AirField af = new AirField();
		af.setAirFleet(populateAirField("jet.txt"));
		System.out.println("Running!");
//		af.displayFleet();
//		Jet j = new Fighter("model", 400.0, 1438, 700_000_000);
//		j.fly();
		af.flyFleet();
	}

	private void menu() {
		System.out.println("----------------------------------------");
		System.out.println("|            Select Option             |");
		System.out.println("|   Select by entering Option's number |");
		System.out.println("|--------------------------------------|");
		System.out.println("|1.) List Fleet.                       |");
		System.out.println("|2.) Fly all jets                      |");
		System.out.println("|3.) View fastest jet.                 |");
		System.out.println("|4.) View jet with longest range.      |");
		System.out.println("|5.) Drop Bombs.                       |");
		System.out.println("|6.) Defend Bombers.                   |");
		System.out.println("|7.) Add a jet to Fleet.               |");
		System.out.println("|8.) Remove a jet from Fleet.          |");
		System.out.println("|9.) Quit.                             |");
		System.out.println("----------------------------------------");
	}

	private ArrayList<Jet> populateAirField(String fileName) {
		ArrayList<Jet> airFleet = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] jetInfo = line.split(", ");
				if (jetInfo[0].equals("F")) {
					Fighter f = new Fighter(jetInfo[1], Double.parseDouble(jetInfo[2]), Integer.parseInt(jetInfo[3]),
							Long.parseLong(jetInfo[4]));
					airFleet.add(f);
				}
				if (jetInfo[0].equals("B")) {
					Bomber b = new Bomber(jetInfo[1], Double.parseDouble(jetInfo[2]), Integer.parseInt(jetInfo[3]),
							Long.parseLong(jetInfo[4]));
					airFleet.add(b);
				}
				if (jetInfo[0].equals("JJ")) {
					JetImpl f = new JetImpl(jetInfo[1], Double.parseDouble(jetInfo[2]), Integer.parseInt(jetInfo[3]),
							Long.parseLong(jetInfo[4]));
					airFleet.add(f);
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		return airFleet;
	}

}
