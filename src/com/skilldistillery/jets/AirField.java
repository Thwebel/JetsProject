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
		for (Jet jet : airFleet) {
			jet.fly();
		}
	}
	public void displayFleet() {
		for (Jet jet : airFleet) {
			System.out.println(jet);
		}
	}
	public void addJet(Jet jet) {
		airFleet.add(jet);
	}
	public void removeJet(Jet jet) {
		airFleet.remove(jet);
	}
	
 }
