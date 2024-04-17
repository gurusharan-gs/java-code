package com._8_eight;

public abstract class Car implements Vehicle {

	abstract void fuelType();
	
	@Override
	public void drive() {
	  System.out.println("driving a car..");
		
	}
}
