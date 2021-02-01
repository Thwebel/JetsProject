package com.skilldistillery.jets;

public class Bomber extends Jet implements AirToGroundAttacker{
	
	
	public Bomber() {
		super();
	}
	public Bomber(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}
	public void dropBomb() {
		System.out.println(this.getModel() + ": Dropping bombs!");
		System.out.println("Hold on to your butts.");
		System.out.println("       \uD83D\uDEE9      \uD83D\uDEE9      \uD83D\uDEE9     \uD83D\uDEE9");
		System.out.println("      .       .       .       .");
		System.out.println("    \uD83D\uDCA3       .       .       .");
		System.out.println("    .       .       .       .");
		System.out.println("   .       .       .       .");
		System.out.println("  .      \uD83D\uDCA3       .       .");
		System.out.println("\uD83C\uDFED      \uD83C\uDFED      \uD83D\uDCA5      \uD83D\uDD25");
		System.out.println("");
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jet Class: Bomber. ").append(super.toString());
		return builder.toString();
	}
	
}
