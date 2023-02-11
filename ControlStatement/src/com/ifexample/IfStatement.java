package com.ifexample;

public class IfStatement {
	
	static int a= 10;
	static int b =20;
	public static void main(String[] args) {
// We can not access Static variable in non static method but here we have main method as static so we can access static variable		
	
	if ( a>b) {
		System.out.println("false");
	}
	else {
		System.out.println("True");
		
	}
	}
}
