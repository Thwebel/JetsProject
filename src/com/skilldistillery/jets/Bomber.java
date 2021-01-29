package com.skilldistillery.jets;

public class Bomber extends Jet implements AirToGroundAttacker{

	public Bomber(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}
	public void dropBomb() {
		System.out.println("Dropping bombs!");
		System.out.println("Hold on to your butts.");
		System.out.println("Plane");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println("KAAAABOOOOOM");
	}
}
