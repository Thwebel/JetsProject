package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JetsApplication {
	private final Scanner kb = new Scanner(System.in);

	public void run() {
		AirField af = new AirField();
		JetsApplication jetsApp = new JetsApplication();
		boolean runningApp = true;
		af.setAirFleet(populateAirField("jet.txt"));
		explainer();
		while (runningApp) {
			menu();
			int selection = checkSelection(kb.nextLine());
			switch (selection) {
			case 0:
				System.out.println("Invalid Input, try again.");
				continue;
			case 1:
				af.displayFleet();
				continue;
			case 2:
				af.flyFleet();
				continue;
			case 3:
				af.findFastest();
				continue;
			case 4:
				af.findLongestRange();
				continue;
			case 5:
				af.dropBombs();
				continue;
			case 6:
				af.scrambleFighters();
				continue;
			case 7:
				jetsApp.pickJetClass(af);
				continue;
			case 8:
				jetsApp.removeJet(af);
				continue;
			case 9:
				runningApp = false;
				System.out.println("");
				System.out.println("Thank you for your decisive input General. We hope to have you back soon.");
				System.out.println("");
				break;
			}
		}
	}

	private void explainer() {
		System.out.println("Welcome General! We are please to have you here to inspect our airfield.\n"
				+ "We have five beautiful bird currently nesting here. Feel free to chose any of the following options!");
		System.out.println("");
		System.out.println("");
	}

	private void menu() {
		System.out.println("----------------------------------------");
		System.out.println("|            Select Option             |");
		System.out.println("|   Select by entering Option's number |");
		System.out.println("|--------------------------------------|");
		System.out.println("|1.) Display Fleet.                    |");
		System.out.println("|2.) Fly all jets.                     |");
		System.out.println("|3.) View fastest jet.                 |");
		System.out.println("|4.) View jet with longest range.      |");
		System.out.println("|5.) Drop Bombs.                       |");
		System.out.println("|6.) Scramble Fighters.                |");
		System.out.println("|7.) Add a jet to Fleet.               |");
		System.out.println("|8.) Remove a jet from Fleet.          |");
		System.out.println("|9.) Quit.                             |");
		System.out.println("----------------------------------------");
	}

	private void removeJet(AirField af) {
		int index = -1;
		boolean selectingLot = true;
		System.out.println("Please select a Jet for remove by entering it's lot number.");
		af.displayFleet();
		System.out.print("Lot to be removed: ");
		while (selectingLot) {

			try {
				index = kb.nextInt();
				kb.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("That was not a valid entry, try again.");
				kb.nextLine();
				continue;
			}
			if (index < 0 || index >= af.getAirFleet().size()) {
				System.out.println("Your selection was out of range, try again");
				continue;
			}
			selectingLot = false;
		}
		af.removeJet(index);
		System.out.println("Successfully removed Jet General, your expertise knows no bounds!");

	}

	private void pickJetClass(AirField af) {
		JetsApplication jetsApp = new JetsApplication();
		boolean pickingJetClass = true;
		int selection = 0;
		String userOption = "";
		while (pickingJetClass) {
			System.out.println("Please select Jet type:");
			jetsApp.displayJetType();
			userOption = kb.nextLine();
			selection = checkSelection(userOption);
			switch (selection) {
			case 1:
				System.out.println("Creating new Regular Jet");
				JetImpl jet = new JetImpl();
				addJet(jet, af);
				break;
			case 2:
				System.out.println("Creating new Fighter Jet");
				Fighter fighterJet = new Fighter();
				addJet(fighterJet, af);
				break;
			case 3:
				System.out.println("Creating new Bomber Jet");
				Bomber bomberJet = new Bomber();
				addJet(bomberJet, af);
				break;
			default:
				System.out.println("A selection was not chosen, check your input and try again.");
				continue;
			}
			break;

		}

	}

	private void addJet(Jet jet, AirField af) {
		boolean gettingSpeed = true, gettingRange = true, gettingPrice = true;
		String model = "";
		double speed = 0.0;
		int range = 0;
		long price = 0L;
		System.out.println("I need this Jet's Model, Speed, Range, and price.");
		System.out.print("Model: ");
		model = kb.nextLine();
		while (gettingSpeed) {
			System.out.println("Speed: ");
			try {
				speed = kb.nextDouble();
				kb.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("That was not a valid entry, try again.");
				kb.nextLine();
				continue;
			}
			gettingSpeed = false;
		}
		while (gettingRange) {
			System.out.println("Range: ");
			try {
				range = kb.nextInt();
				kb.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("That was not a valid entry, try again.");
				kb.nextLine();
				continue;
			}
			gettingRange = false;
		}
		while (gettingPrice) {
			System.out.println("Price: ");
			try {
				price = kb.nextLong();
				kb.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("That was not a valid entry, try again.");
				kb.nextLine();
				continue;
			}
			gettingPrice = false;
		}
		jet.setModel(model);
		jet.setSpeed(speed);
		jet.setRange(range);
		jet.setPrice(price);
		af.addJet(jet);
		System.out.println("\nJet has successfully been added to the fleet General!\n");
	}

	private int checkSelection(String input) {
		int selection = 0;
		if (input.trim().equals("1") || input.toUpperCase().trim().equals("ONE")
				|| input.toUpperCase().trim().equals("DISPLAY FLEET")) {
			selection = 1;
			return selection;
		} else if (input.trim().equals("2") || input.toUpperCase().trim().equals("TWO")
				|| input.toUpperCase().trim().equals("Fly all jets".toUpperCase())) {
			selection = 2;
			return selection;
		} else if (input.trim().equals("3") || input.toUpperCase().trim().equals("THREE")
				|| input.toUpperCase().trim().equals("View fastest jet".toUpperCase())) {
			selection = 3;
			return selection;
		} else if (input.trim().equals("4") || input.toUpperCase().trim().equals("FOUR")
				|| input.toUpperCase().trim().equals("View jet with longest range".toUpperCase())) {
			selection = 4;
			return selection;
		} else if (input.trim().equals("5") || input.toUpperCase().trim().equals("FIVE")
				|| input.toUpperCase().trim().equals("Drop Bombs".toUpperCase())) {
			selection = 5;
			return selection;
		} else if (input.trim().equals("6") || input.toUpperCase().trim().equals("SIX")
				|| input.toUpperCase().trim().equals("Scramble Fighters".toUpperCase())) {
			selection = 6;
			return selection;
		} else if (input.trim().equals("7") || input.toUpperCase().trim().equals("SEVEN")
				|| input.toUpperCase().trim().equals("Add a jet to Fleet".toUpperCase())) {
			selection = 7;
			return selection;
		} else if (input.trim().equals("8") || input.toUpperCase().trim().equals("EIGHT")
				|| input.toUpperCase().trim().equals("Remove a jet from Fleet".toUpperCase())) {
			selection = 8;
			return selection;
		} else if (input.trim().equals("9") || input.toUpperCase().trim().equals("NINE")
				|| input.toUpperCase().trim().equals("QUIT")) {
			selection = 9;
			return selection;
		} else {
			return selection;
		}
	}

	private void displayJetType() {
		System.out.println("----------------------------------------");
		System.out.println("|            Select Option             |");
		System.out.println("|   Select by entering Option's number |");
		System.out.println("|--------------------------------------|");
		System.out.println("|1.) Regular Jet.                      |");
		System.out.println("|2.) Fighter Jet.                      |");
		System.out.println("|3.) Bomber Jet.                       |");
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
