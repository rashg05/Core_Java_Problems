package com.bridgelab.corejavaprograms.functionalprograms;

import java.util.*;

public class Quadratic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a ");
		double a = sc.nextDouble();
		System.out.println("enter the value of b ");
		double b = sc.nextDouble();
		System.out.println("enter the value of c");
		double c = sc.nextDouble();
		System.out.println("The equation is" + a + "x^2" + b + "x" + c);
		
		double delta = (b * b) - (4 * a * c); 
		double x1 = ((-1 * b) + Math.sqrt(delta))/(2 * a);
		double x2 = ((-1 * b) - Math.sqrt(delta))/(2 * a);
		System.out.println(delta);
		
		System.out.println("root 1 off x is " + x1);
		System.out.println("root 2 of x is " + x2);
		
		sc.close();
	}

}
