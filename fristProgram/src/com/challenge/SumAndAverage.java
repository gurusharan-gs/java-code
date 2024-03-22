package com.challenge;

public class SumAndAverage {
	
	public static int sumAndAverage(int[] arr) {
		int sum = 0;
		for(int i=0; i < arr.length; i++) {
			sum += arr[i];
		}
		int average = sum / arr.length;
		return average;
	}
	
	public static void main(String[] args) {
		int[] intArray = {1, 2, 3, 4, 5};
		System.out.println(sumAndAverage(intArray));
	}

}
