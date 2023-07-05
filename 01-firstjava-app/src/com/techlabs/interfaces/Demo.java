package com.techlabs.interfaces;

public class Demo implements IDemo1,IDemo2{
	public void method()
	{
		IDemo1.super.method();
		IDemo2.super.method();
	}

}
