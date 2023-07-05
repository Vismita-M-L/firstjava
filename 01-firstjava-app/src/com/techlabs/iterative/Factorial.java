package com.techlabs.iterative;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scanner.nextInt();
		int fact=1;
		int i=number;
		while(i>1);
		{
			fact=fact*i;
			i--;
			
		}
		System.out.println("factorial:"+fact);
		
		
	

	}

}
