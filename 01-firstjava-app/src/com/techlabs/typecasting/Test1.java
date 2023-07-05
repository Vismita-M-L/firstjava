package com.techlabs.typecasting;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
	    int n=Integer.parseInt(args[0]);  
		int array[]=new int[n];
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter array element");
		for(int i=0; i<n ;i++)
			array[i]=scanner.nextInt();
			
		int sum=0;
	    for(int i=0; i<n ;i++)
	    	sum = sum + array[i];
	    	System.out.println("Sum of all the elements of an array: " + sum); 
	}
}
	    		
	    		   


