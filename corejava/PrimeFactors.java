package com.bridgelab.corejavaprograms.corejava;

import java.util.*;

public class PrimeFactors {
	public static void prime_factors(int number) {
		for (int i = 2; i <= (number); i++) {
			while((number % i) == 0) {
				System.out.print(i+"\t");
				number = number / i;
			}
		}
		if (number > 2)
			System.out.print("\t" + number);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = sc.nextInt();
		prime_factors(number);
		sc.close();
	}

}
