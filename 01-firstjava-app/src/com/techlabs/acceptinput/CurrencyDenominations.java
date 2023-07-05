package com.techlabs.acceptinput;

import java.util.Scanner;

public class CurrencyDenominations {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter withdrawal amount");
		int amount= input.nextInt();
		int twothousand=amount/2000;
		amount=amount%2000;
		int fivehundred=amount/500;
		amount=amount%500;
		int twohundred=amount/200;
		amount=amount%200;
		int hundred=amount/100;
		amount=amount%100;
		System.out.println("Number of twothousand"+ twothousand);
		System.out.println("Number of fivehundred"+ fivehundred);
		
		
		

	}

}
