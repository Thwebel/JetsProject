package com.skilldistillery.jets;

public class Fighter extends Jet implements AirToAirAttacker {

	public Fighter(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}
	public void scrambleFighters() {
		
		System.out.println("Red Leader going in!!");
		System.out.println("pew pew pew");
		System.out.println("Bang!");
		System.out.println("This Is What I Call A Target-Rich Environment.");
		System.out.println("ratatatatatatatatatatata");
		System.out.println("pew pew pew");
		System.out.println("Hostiles Destroyed, you can be my wingman anytime.");
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jet Class: Fighter. ").append(super.toString());
		return builder.toString();
	}
}
