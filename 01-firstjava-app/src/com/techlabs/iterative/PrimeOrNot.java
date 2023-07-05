package com.techlabs.iterative;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int n= input.nextInt();
		int i=2,count=0;
		while(i <= n /2) {
			if(n %i==0) {
				count++;
				break;
				
			}
			i++;
		}
		if(count==0) {
			System.out.println(n+" is prime number");
		}else {
			System.out.println(n+" is not  prime number");	
		}

	}

}
