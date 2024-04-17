package com._7_seventh;

public class Circle extends Shape {
	
	private double radius; 
	
    public Circle(double radius) {
        this.radius = radius;
    }
	
      @Override
      public void draw() {
    	// TODO Auto-generated method stub
    	System.out.println("Drawing Circle " + radius);
    }
}
