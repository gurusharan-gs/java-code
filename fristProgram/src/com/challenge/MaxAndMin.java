package com.challenge;

public class MaxAndMin {
	
//	finding maximum value
	public static int maxValueGivenArray(int[] arr) {
		int max = Integer.MIN_VALUE;
		int i=0; 
		
		while(i < arr.length) {
			if(arr[i] > max) {
				max = arr[i];
			}
			i++;
		}
		return max;
	}
	
//	find minimum value
	public static int minValueGivenArray(int[] arr) {
		int min = Integer.MAX_VALUE;
		int i=0; 
		
		while(i < arr.length) {
			if(arr[i] < min) {
				min = arr[i];
			}
			i++;
		}
		return min;
	}
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		System.out.println("min value "+ minValueGivenArray(array));
		System.out.println("max value "+ maxValueGivenArray(array));
	}

}
