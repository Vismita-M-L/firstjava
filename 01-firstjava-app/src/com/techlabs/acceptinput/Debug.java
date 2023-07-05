package com.techlabs.acceptinput;

public class Debug {

	public static void main(String[] args) {
		
		int number1=2;
		int number2=3;
		
		int sum=addition(number1,number2);
		System.out.print(sum);
		

	}

	private static int addition(int number1, int number2) {
		int add;
		add=number1+number2;
		return add;
	}

}
