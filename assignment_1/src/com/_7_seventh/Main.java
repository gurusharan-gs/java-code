package com._7_seventh;

public class Main {
	public static void main(String[] args) {

		Shape shape = new Shape();
		shape.draw();

		Circle circle = new Circle(10);
		circle.draw();

		Rectangle rectangle = new Rectangle(15, 20);
		rectangle.draw();

	}
}
