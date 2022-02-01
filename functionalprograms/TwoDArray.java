package com.bridgelab.corejavaprograms.functionalprograms;

import java.io.*;
import java.util.*;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of Rows");
		int rows = sc.nextInt();
		System.out.println("Enter number of Columns");
		int columns = sc.nextInt();
		TwoDArray twoDArray = new TwoDArray();
		twoDArray.setArrayValues(rows,columns);
		sc.close();
	}
	public void setArrayValues(int rows, int columns) {
		int [][]twoDArr = new int [rows][columns];
		Scanner sc =new Scanner(System.in);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println("enter the value of [" + i + "][" + j+"]==>");
				twoDArr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		TwoDArray twoDArray = new TwoDArray();
		twoDArray.printArrayValues(twoDArr, rows, columns);
	}
		
	public void printArrayValues (int [][] twoDArr, int ro, int col) {
		PrintWriter writer = new PrintWriter(System.out);
		for (int i = 0; i < ro; i++) {
			for (int j = 0; j < col; j++) {
				writer.write("" + twoDArr[i][j] +"\t");
				writer.flush();
			}
			System.out.println("");
		}
		
		writer.close();
	}
}
