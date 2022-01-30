package com.bridgelab.corejavaprograms.corejava;

import java.util.*;

public class PowerOf {

	public static void main(String[] args) {

		// INITIALIZATION
		int multiply = 1;

		// DATA INPUT THROUGH COMMAND LINE
		Scanner sc = new Scanner(System.in);
		System.out.println("number");
		int num = sc.nextInt();
		sc.close();

		// CONDITION CHECK
		if (num > 31) {
			System.out.println("Value of number should be less than 31");
			return;
		}

		// COMPUTATION
		else {
			System.out.println(multiply);
			for (int j = 1; j <= num; j++) {
				multiply = multiply * 2;
				System.out.println(multiply);
			}
		}
		

	}

}
