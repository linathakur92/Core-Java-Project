package com.controlstatement;
//WAP to check grades of Students According to marks
// Whenever we wanted to check multiple condition that time we have to go for if else ladder


public class IfElseLadder {
	
	public static void main(String[] args) {
		  int percentage = 85;               // variable declaration for Percentage and Assigning the value (we can change the value of input variable
		  if(percentage>65 && percentage <75) {      // check if condition for percentage
			  System.out.println("disctintion");        //if both condition true then print distinction
		  } 
		  else if(percentage >= 35 && percentage<55) {
			  System.out.println("B++");
		  }
		  else if(percentage<35) {
			  System.out.println("fail");
		  }
		  else {
			  System.out.println("Invalid input");
		  }	  
	}
}
