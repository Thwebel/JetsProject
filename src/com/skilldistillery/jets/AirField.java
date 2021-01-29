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
	
	public void findFastest() {
		double speed = 0.0;
		Jet fastestJet = new JetImpl(null, 0,0,0);
		for (Jet jet : airFleet) {
			if (jet.getSpeed()> speed) {
				speed = jet.getSpeed();
				fastestJet = jet;
			}
		}
		System.out.println("Information of fastest Jet: \n" + fastestJet.toString());
	}
	public void findLongestRange() {
		double range = 0.0;
		Jet furthestFlyer = new JetImpl(null, 0,0,0);
		for (Jet jet : airFleet) {
			if (jet.getRange()> range) {
				range = jet.getRange();
				furthestFlyer = jet;
			}
		}
		System.out.println("Information of Jet with the longest Range: \n" + furthestFlyer.toString());
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
