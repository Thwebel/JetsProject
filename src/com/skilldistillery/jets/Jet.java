package com.skilldistillery.jets;

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
		
	}
	public double getSpeedInMach() {
		double speedInMach = 0.0;
		
		return speedInMach;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jet [model=").append(model).append(", speed=").append(speed).append(", range=").append(range)
				.append(", price=").append(price).append("]");
		return builder.toString();
	}
	
}
