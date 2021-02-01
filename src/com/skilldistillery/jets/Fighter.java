package com.skilldistillery.jets;

public class Fighter extends Jet implements AirToAirAttacker {

	
	
	public Fighter() {
		super();
	}
	public Fighter(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	public void scrambleFighters() {
		System.out.println(this.getModel() + " ready to engage!");
		System.out.println(" \uD83D\uDEE9 - - - - - - - -\uD83D\uDCA5");
		System.out.println("   \uD83D\uDEE9 - - - - - - - - \uD83D\uDEF8");
		System.out.println("      \uD83D\uDEE9 - - - - - - - -\uD83D\uDCA5");
		System.out.println("   \uD83D\uDEE9 - - - - - - - -  \uD83D\uDEF8");
		System.out.println(" \uD83D\uDEE9 - - - - - - - -  \uD83D\uDEF8");
		
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jet Class: Fighter. ").append(super.toString());
		return builder.toString();
	}
}
