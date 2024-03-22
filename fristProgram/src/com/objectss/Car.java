package com.objectss;

public class Car {
	
	int noOfWheels;
	String color;
	float maxSpeed;
	float currentFuelInLiters;
	int noOfSeats;
	
	public Car start() {
		if(currentFuelInLiters == 0) {
			System.out.println("Car is out of fuel, can not start..");
		}else if(currentFuelInLiters < 5) {
			System.out.println("Car is in reserved mode, please refuel");
		}else {
			System.out.println("Car is started..bruhhhmmm...");
		}
		
		return this;
	}
	
	public void drive() {
		    System.out.println("Car is draving..");
			currentFuelInLiters--;
	}
	
	public void addFuel(float fuel) {
	   currentFuelInLiters += fuel;
	}
	
	public float getCurrentFuelInLiters() {
		   return currentFuelInLiters;
		}

}
