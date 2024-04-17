package com.switchop;

public class Demo {
	
	public static void newDays(int day) {
		
		String str = switch(day) {
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Thursday";
		case 5 -> "Friday";
		case 6, 7 -> "Holiday";
		
		default -> "invalid";
		};
		
		System.out.println(str);
		
	}
	
	public static void main(String[] args) {
		newDays(2);
	
	}

}
