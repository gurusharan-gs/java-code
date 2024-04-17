package com._7_seventh;

public class Rectangle extends Shape {
	
	    private double length;
	    private double breadth;
	    
	    public Rectangle(double length, double breadth) {
	        this.length = length;
	        this.breadth = breadth;
	    }
	    
		@Override
		public void draw() {
			System.out.println("Drawing Rectangle " + length + " and " + breadth);
		}
}
