package com.bridgelab.corejavaprograms.corejava;

import java.util.*;

public class FlipCoin {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Number of times Coin Flips");
		int counter=sc.nextInt();

		if ( counter > 0) {
			System.out.println("number of times "+counter);
			FlipCoin fc = new FlipCoin();
			fc.flipCoin(counter);
		}
		sc.close();
	}
	public void flipCoin(int count) {
		double headCounter = 0;
		double tailCounter = 0;
		double headPercent = 0;
		double tailPercent = 0;
		for (int i=0;i<count;i++) {
			double random = Math.random();
			if (random > 0.5)
				headCounter++;
			else
				tailCounter++;
		}

		headPercent = (headCounter/count)*100;
		tailPercent = (tailCounter/count)*100;
		System.out.println("Head Count = "+headCounter);
		System.out.println("Tail Count = "+tailCounter);
		System.out.println("Head Percent = "+headPercent);
		System.out.println("Tail Percent = "+tailPercent);
	}
}
