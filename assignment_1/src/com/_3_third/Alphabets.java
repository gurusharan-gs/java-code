package com._3_third;

import java.util.*;

public class Alphabets implements Runnable {

	private StringBuffer sb;
	private char start;
	private char end;

	public Alphabets(StringBuffer sb, char start, char end) {
		this.sb = sb;
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		for (char c = start; c <= end; c++) {
			synchronized (sb) {
				sb.append(c);
			}
		}
	}

}
