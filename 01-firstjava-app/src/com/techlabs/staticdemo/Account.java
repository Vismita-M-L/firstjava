package com.techlabs.staticdemo;

import java.util.Scanner;

public class Account {
          private int accountnumber;
          private String name;
          private double balance;
		public Account(int accountnumber, String name, double balance) {
			super();
			this.accountnumber = accountnumber;
			this.name = name;
			this.balance = balance;
		}
		@Override
		public String toString() {
			return "Account [accountnumber=" + accountnumber + ", name=" + name + ", balance=" + balance + "]";
		}
          
	}

