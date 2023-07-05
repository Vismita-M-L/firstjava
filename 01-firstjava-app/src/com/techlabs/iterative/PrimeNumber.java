package com.techlabs.iterative;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int n= input.nextInt();
		
		int i=1;
		System.out.println("Multiplication of table "+n+" is");
		
		while(i <=10)
		{
			System.out.println(n+" * "+i+" = "+ (n*i));
			i++;
		}
		  

	}

}
