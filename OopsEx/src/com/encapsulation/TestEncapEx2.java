package com.encapsulation;

import java.util.Scanner;

public class TestEncapEx2 {

	public static void main(String args []) {
	System.out.println( "Take the value from User");	
	Scanner s = new Scanner(System.in);
	  String     p    = s.next();
	  
	  
		EncapEx2 e = new EncapEx2();
		         e.setAge(p);
		         e.setB(p);
		         
		         System.out.println("get the value: " + e.getAge());
		         System.out.println("get the Value: " + e.getB());
	}         
}
