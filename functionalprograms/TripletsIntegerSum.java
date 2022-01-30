package com.bridgelab.corejavaprograms.functionalprograms;

import java.util.*;

public class TripletsIntegerSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total count");
		int count = sc.nextInt();
		
		int total = 0;
		int [] number = new int[count];
		for (int i = 0; i < count; i++) {
			System.out.println("enter the number " + (i+1));
			number[i] = sc.nextInt();
		}
		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				for (int k = j + 1; k < count; k++) {
					if ((number[i] - number[j] - number[k]) == 0) {
						System.out.println(number[i] + "-" + number[j] +"-" + number[k] +"= 0");
						total ++;
					}	
				}
			}
		}
		System.out.println("total number of triplets is "+total);
		sc.close();
	}

}
