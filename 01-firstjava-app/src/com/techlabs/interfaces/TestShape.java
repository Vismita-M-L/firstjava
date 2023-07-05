package com.techlabs.interfaces;

public class TestShape {

	public static void main(String[] args) {
		Circle shape;
		shape=new Circle(5);
		shape.area();
		shape.discription();
		
		IShape sha;
			sha=new Circle(6);
		sha.area();
		sha.discription();

	}

}
