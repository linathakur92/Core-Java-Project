package com.ifexample;

import java.util.Scanner;

public class IfElse {
 static int age;
 
 public static void main(String[] args) {
	 
	System.out.println(" Enter the Age");
	Scanner s = new Scanner (System.in);
	   int    p =s.nextInt();
	   
	if (p>=18) {
		System.out.println(" Eligible for Voting");
	}
	else {
		System.out.println("not eligible for voting");
	}
}
   
}
