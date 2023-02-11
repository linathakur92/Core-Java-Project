package com.ifexample;

import java.util.Scanner;

// marks<50 = fail, 50-60...D , marks>60..A
public class IfElseIf {
  static  int marks;
    
    public static void main(String[] args) {
	System.out.println("Enter the MArks");
	Scanner s = new Scanner(System.in);
	    int   p =s.nextInt();
		
	
    	if (p<50) {
    		System.out.println("fail");
    	}
    	else if(p >50 && p<60) {
    		System.out.println("D");
    		
    	}
    	else if(p>60) {
    		System.out.println("A");
    	}
    	else {
    		System.out.println("Invalid");
    	}
	}
    
}
