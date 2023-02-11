package com.do_while;

import java.util.Scanner;

// Write a program to print a table of no. and print result in method m1;
//Take a input(value) from user means Scanner class and pass that to method

public class DoWhile {
	
	public static void main(String[] args) {
		
		System.out.println(" eNTER THE NO");
		 Scanner s = new Scanner(System.in); // Scanner Class object creation
		     int p    =s.nextInt();   // take int type value from user with the help of Scanner class Object
		
		DoWhile d = new DoWhile();  // Create a object of Class
		        d.m1(p);            // Call method m1 by obj of class and pass value which took from user
           
	}
	public void m1(int q) {       // Parameterized method Declaration
		int i=1;                  // initialization for index
	
		do {                      // Stating of Do loop for repeated multiplication
			System.out.println(i*q); // perform multiplication operation and print it
			i++;                      // increment the indext for next iteration
		}
		while(i<=10);               // Condition check in while loop.
		
		
	 
		
	}

}
