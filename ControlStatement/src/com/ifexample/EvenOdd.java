package com.ifexample;

import java.util.Scanner;

public class EvenOdd {
	
	static int numb;
	 public static void main(String args[]) {
	System.out.println("TAKE THE NUMBER FROM USER");	 
	Scanner s = new Scanner(System.in);
	       int num = s.nextInt();
		 if (num%2==0) {
			 
			 System.out.println("Number is Even");
			 
		 }
		 else {
			 System.out.println("number is odd");
		 }
	 }

}
