package com.techlabs.interfaces;

public interface IShape {
	void area();
	default  void discription() {
		System.out.println("Different Shapes");
	}
	
	

}
