package com.challenge;

public class checkArrayIsSorted {
	
	
	public static boolean incArr(int[] arr) {
		int i =1;
		while(i < arr.length) {
			if(arr[i] < arr[i-1]) {
				return false;
			}
			i++;
		}
		return true;
	}
	
	public static boolean decArr(int[] arr) {
		int i =1;
		while(i < arr.length) {
			if(arr[i] > arr[i-1]) {
				return false;
			}
			i++;
		}
		return true;
	}
	
	
    public static boolean isSortedDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false; 
            }
        }
        return true; 
    }
    
    public static boolean isSortedAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; 
            }
        }
        return true; 
    }
	
	public static void main(String[] args) {
		int[] inc = {1,2,3,6,5};
		System.out.println(incArr(inc));
		
		int[] dec = {5,4,3,2,1};
		System.out.println(decArr(dec));
		
	}
	

}
