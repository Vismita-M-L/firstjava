package com.techlabs.two;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int matrix[][]= new int[3][3];
		readMatrix(matrix,scanner);
		displayMatrix(matrix);
		

	}

	
	

	private static void readMatrix(int[][] matrix, Scanner scanner) {
		System.out.println("enter matrix elements");
		for (int i=0;i<3;i++)
			readRow(matrix,i,scanner);
		
	}

	private static void readRow(int[][] matrix, int i, Scanner scanner) {
		for (int j=0;j<3;j++)
			matrix[i][j]=scanner.nextInt();
		
	}
	
	private static void displayMatrix(int[][] matrix) {
		System.out.println(" matrix elements"+"\t");
		for (int i=0;i<3;i++)
			displayRow(matrix,i);
		
		
	}

	private static void displayRow(int[][] matrix, int i) {
		for (int j=0;j<3;j++)
			System.out.print(matrix[i][j]);	
		System.out.println("");
		
	}
}
