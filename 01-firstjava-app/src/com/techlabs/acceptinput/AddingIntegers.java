package com.techlabs.acceptinput;

import java.util.Scanner;

public class AddingIntegers {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first number");
		int number1=scanner.nextInt();
		System.out.println("Enter second number");
		int number2=scanner.nextInt();
		int sum=number1+number2;
		System.out.println("Addition="+sum);
	}

}

