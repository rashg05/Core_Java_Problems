package com.bridgelab.corejavaprograms.corejava;

import java.util.*;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		sc.close();
		int number = sc.nextInt();
		
		if (number % 2 == 0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
	}
}
