package com.bridgelab.corejavaprograms.corejava;

import java.util.*;

public class VowelOrConsonant {

	public static void main(String[] args) {
		String []vowels = {"a","e","i","o","u","A","E","I","O","U"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the letter");
		String letter = sc.next();
		sc.close();
		String result = "consonant";
		for (int i =0; i < vowels.length; i++) {
			if (vowels[i] .equals(letter)) {
				result = "vowels";
			}
		}
		System.out.println("Given letter is an " +result);
		

	}

}
