package com.bridgelab.corejavaprograms.corejava;

import java.util.*;

public class QuotientRemainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of divident");
		int divident = sc.nextInt();
		System.out.println("Enter the value of divisor");
		int divisor = sc.nextInt();
		sc.close();
		int quotient = divident / divisor;
		int remainder = divident % divisor;
		
		System.out.println("quotient = " + quotient);
		System.out.println("remainder = " + remainder);

	}

}
