package com.skilldistillery.jets;

import java.text.NumberFormat;

public abstract class Jet {
	
	private String model;
	private double speed;
	private int range;
	private long price;
	
	
	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	
	public void fly() {
		double flyTimeAtTopSpeed = range / speed;
		System.out.printf("The " + model + " can fly for %.2f hours at Top Speed%n", flyTimeAtTopSpeed);
		
		
//		Fly all Jets calls the fly() method on the entire fleet of jets.
//		fly() prints out the jet details and the amount of time the jet can fly until it runs out of fuel (based on speed and range).
		
	}
	public double getSpeedInMach() {
		double speedInMach = 0.0;
		
		return speedInMach;
	}

	@Override
	public String toString() {
		NumberFormat myFormat = NumberFormat.getInstance();
	    myFormat.setGroupingUsed(true);
	    
		StringBuilder builder = new StringBuilder();
		builder.append("Model: ").append(model).append(", speed: ").append(myFormat.format(speed)).append("mph")
			.append(", range: ").append(myFormat.format(range)).append(" Miles")
			.append(", price: $").append(myFormat.format(price)).append(".");
		
		return builder.toString();
	}
	
}
