package com.bridgelab.corejavaprograms.corejava;

import java.util.*;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number 1= ");
		int num1 = sc.nextInt();
		System.out.println("enter the number 2= ");
		int num2 = sc.nextInt();
		System.out.println("enter the number 3= ");
		int num3 = sc.nextInt();
		sc.close();
		int largest;
		if (num1 > num2) {
			largest = num1;
		}
		else {
			largest = num2;
		}
		if (num3 > largest) {
			largest = num3;
		}
		System.out.println("largest number is " + largest);
		sc.close();
	}
}

