package com.challenge;

public class FindOccurrences {

	public static int findOccurrences(int[] arr, int num) {
		int count = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == num) {
//				count++;
//			}
//		}
		int i = 0;
		while(i < arr.length) {
			if(arr[i] == num) {
				count++;
			}
			i++;
		}
		return count;
	}

	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5, 1, 2, 1, 4, 3, 1, 6, 4, 1 };
		int num = 1;
		System.out.println(findOccurrences(intArray, num));
	}
}
