package com.bridgelab.corejavaprograms.functionalprograms;

import java.util.*;

public class WindChill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the temperature in farenheit ");
		double t = sc.nextDouble();
		System.out.println("enter the wind speed in miles per hour");
		double v = sc.nextDouble();
		sc.close();
		double result = 0;
		if (v > 3 && v <120 && t > 0 && t < 50) {
			WindChill windChill = new WindChill();
			result = windChill.calculateChill(t, v);
			System.out.println("wind chill " + result);
		}
		else {
			System.out.println("please enter the valid data");
		}
		
	}
	public static double calculateChill(double t, double v) {
		double w = 0;
		double a = (35.74 + (0.6125*t));
		double b = ((0.4275*t) - 35.75)*v;
		w = a +Math.pow(b , 0.16);
		return w;
	}

}
