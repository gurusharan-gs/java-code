package com.first;

public class Main {
	
//	Instance methods:
	public void myNmae1() {
		System.out.println("GuruSharan__1");
	}
	
//	Static methods: 
	public static void myNmae2() {
		System.out.println("GuruSharan__2");
	}
	
//	Abstract methods:
//	public abstract void myNmae3();
	
	
	public static void main(String[] args) {
		
		byte myByte = 100;
		
		short myShort = 20000;
		
		int myInt = 1000000;
		
		long myLong = 10000000000L; 
		
		float myFloat = 3.14f;
		
		double myDouble = 3.14159265359;
		
		char myChar = 'A';
		
		boolean myBoolean = true;
		
//		System.out.println("Byte "+myByte);
//		System.out.println("Short "+myShort);
//		System.out.println("Int "+myInt);
//		System.out.println("Long "+myLong);
//		System.out.println("Float "+myFloat);
//		System.out.println("Double "+myDouble);
//		System.out.println("Char "+myChar);
//		System.out.println("Boolean "+myBoolean);
//		
//		System.out.println("methods in java");
		
//		Main m = new Main();
//		m.myNmae1();
//		System.out.println("--------------");
//		myNmae2();
		
		int[] arr1 = new int[6];
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		arr1[4] = 5;
		int j = 0;
		while(j < arr1.length) {
			System.out.print(arr1[j]+" ");
			j++;
		}
		System.out.println();
	
		System.out.println("----------------------");
		
		int[] arr2 = {1,2,3,4,5,6};
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		
	}

}
