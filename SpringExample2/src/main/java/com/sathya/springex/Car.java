package com.sathya.springex;

public class Car implements Vehicle{
	private String fuelType;
	private int maxSpeed;
	
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public void move() {
		System.out.println("Your selected car vehicle");
		System.out.println("Max speed..."+maxSpeed);
		System.out.println("Fuel Type.."+fuelType);
	}
	
}



