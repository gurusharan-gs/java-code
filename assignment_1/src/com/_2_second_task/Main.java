package com._2_second_task;
import java.util.*;

public class Main {
	
	 public static void main(String[] args) {
	        long startTime, endTime;

	        // String Concatenation Taming..
	        
	        startTime = System.nanoTime();
	        String stringResult = "";
	        for (int i = 0; i < 10000; i++) {
	            stringResult += "a";
	        }
	        endTime = System.nanoTime();
	        System.out.println("String concatenation time: " + (endTime - startTime) / 1000000);

	        // StringBuilder Concatenation Taming..
	        startTime = System.nanoTime();
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < 10000; i++) {
	            sb.append("a");
	        }
	        String sbResult = sb.toString();
	        endTime = System.nanoTime();
	        System.out.println("StringBuilder concatenation time: " + (endTime - startTime) / 1000000);

	        // StringBuffer Concatenation Taming..
	        startTime = System.nanoTime();
	        StringBuffer sbfr = new StringBuffer();
	        for (int i = 0; i < 10000; i++) {
	        	sbfr.append("a");
	        }
	        String sbfrResult = sbfr.toString();
	        endTime = System.nanoTime();
	        System.out.println("StringBuffer concatenation time: " + (endTime - startTime) / 1000000);
	    }

}
