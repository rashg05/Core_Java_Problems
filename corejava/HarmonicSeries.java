package com.bridgelab.corejavaprograms.corejava;

import java.util.*;

public class HarmonicSeries {

	public static void main(String[] args) {
		double lastAns;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number = ");
		int count = sc.nextInt();
		sc.close();
		if (count > 0) {
			HarmonicSeries Harmonic = new HarmonicSeries();
			lastAns = Harmonic.findHarmonic(count);
			System.out.println("Here is the nth Harmonic value " +lastAns);
		}
		else {
			System.out.println("invalid data");
		}
	}
	public double findHarmonic(int count) {
		double result = 0;
		for (double i = 1;i < count; i++) {
			result += 1/i;	
		}
		return result;
	}

}
