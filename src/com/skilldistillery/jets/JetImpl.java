package com.skilldistillery.jets;

public class JetImpl extends Jet{

	public JetImpl(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}
	public JetImpl() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jet Class: Reg Jet. ").append(super.toString());
		return builder.toString();
	}
}
