package com._8_eight;

public class Main {
	
	public static void main(String[] args) {
		ElectricCar ec = new ElectricCar();
		ec.drive();
		ec.fuelType();
		
		GasCar gc = new GasCar();
		gc.drive();
		gc.fuelType();
	}

}
