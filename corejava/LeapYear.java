package com.bridgelab.corejavaprograms.corejava;

import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scyear = new Scanner(System.in);
		System.out.println("Enter the year you want to search");
		int year = scyear.nextInt();
		scyear.close();
		if (year > 999 && year < 10000)
			if ((year % 4 ==0 && year % 100 != 0) || year % 400 == 0)
				System.out.println("This is leap year");
			else
				System.out.println("This is not leap year");
		else
			System.out.println("Sorry, you have entered invalid data");
	}
}
