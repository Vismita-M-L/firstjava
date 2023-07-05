package com.techlabs.typecasting;

import java.util.Scanner;

public class MaximumArrayElement {

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);  
		int array[]=new int[n];
		int max = array[0];
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter array element");
		for(int i=0; i<n ;i++)
			array[i]=scanner.nextInt();
			
		int sum=0;
	    for(int i=0; i<n ;i++)
	    	sum = sum + array[i];
	    	System.out.println("Sum of all the elements of an array: " + sum); 
	    for (int i = 0; i < n; i++) {  
	              
	           if(array[i] > max)  
	               max = array[i];  
	        }  
	        System.out.println("Largest element present in given array: " + max);  

	}

}
