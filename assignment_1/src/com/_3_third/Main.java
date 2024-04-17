package com._3_third;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		Thread thread = new Thread(new Alphabets(sb, 'a', 'z'));

		thread.start();

		try {
			thread.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(sb.toString());

	}

}
