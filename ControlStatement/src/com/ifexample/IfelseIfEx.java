package com.ifexample;

import java.util.Scanner;

public class IfelseIfEx {
    String s;
    
	public static void main(String[] args) {
		System.out.println(" Enter the City");
		Scanner x = new Scanner(System.in);
		       String city  =x.next();
		       
		   if(city =="Delhi") {
			   System.out.println("no.1 It hub");
			   
		   }
		   else if (city =="Pune") {
			   System.out.println("no.2 it hub");
			   
			 }
		   else if (city =="Banglor") {
			   System.out.println("no. 3 IT hub");
			   
		   }
		   else {
			   System.out.println("Invalid city");
			   
		   }
	}
    
    
    
    
    
    
	
}
