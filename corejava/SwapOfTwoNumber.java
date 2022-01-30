package com.bridgelab.corejavaprograms.corejava;

import java.util.*;

public class SwapOfTwoNumber {
	
	public static void values(int x,int y) {
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("Here's your swapped Values");	
		System.out.println("New value of a is : " + x + "\nNew value of b is : " + y );
	}

	public static void main(String[] args) {
		int a;
		int b;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter value of a : ");
		a = s.nextInt();

		System.out.println("Enter value of b : ");
		b = s.nextInt();

		values(a,b);

	}

}
