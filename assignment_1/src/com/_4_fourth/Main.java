package com._4_fourth;

public class Main {
	
	// String
	public static void reverseWithString(String str) {
	    String reverse = "";
		for(int i = str.length()-1; i>=0; i--) {
			reverse += str.charAt(i);
		}
		System.out.println(reverse);
	}

	// StringBuilder
	public static void reverseWithSBuilder(String str) {
	    StringBuilder sb = new StringBuilder();
	    for(int i= str.length()-1; i>=0; i--) {
	    	sb.append(str.charAt(i));
	    }
	    System.out.println(sb);
	}
	
	// StringBuffer
	public static void reverseWithSBuffer(String str) {
	    StringBuffer sb = new StringBuffer();
	    for(int i= str.length()-1; i>=0; i--) {
	    	sb.append(str.charAt(i));
	    }
	    System.out.println(sb);
	}

	public static void main(String[] args) {
		reverseWithString("String");
		reverseWithSBuilder("StringBuilder");
		reverseWithSBuffer("StringBuffer");
		
	}
}
