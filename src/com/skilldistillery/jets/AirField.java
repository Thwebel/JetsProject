package com.skilldistillery.jets;

import java.util.ArrayList;

public class AirField {
	private ArrayList<Jet> airFleet = new ArrayList<>();

	public ArrayList<Jet> getAirFleet() {
		return airFleet;
	}

	public void setAirFleet(ArrayList<Jet> airFleet) {
		this.airFleet = airFleet;
	}
	
	
	public void flyFleet() {
		int index = 0;
		for (Jet jet : airFleet) {
			System.out.print("Lot " + index + ": ");
			jet.fly();
			index++;
		}
	}
	public void displayFleet() {
		int index = 0;
		for (Jet jet : airFleet) {
			System.out.println("Lot: " + index +".) "+ jet);
			index++;
		}
	}
	public void addJet(Jet jet) {
		airFleet.add(jet);
	}
	public void removeJet(Jet jet) {
		airFleet.remove(jet);
	}
	
 }
