package com.controlstatement;
// Whenever the condition are interdependent with each other then we have to go for nested if 

public class NestedIf {
	 
	public static void main(String args[])
	    {
	     int age = 19;
	     boolean votingCard = true;
	    
	     if(age>18) {          // Check age is value if true then go inside
	    	 if(votingCard) {  // Check voting card is there or not if true then go inside. if false then go else
	    		 System.out.println("You are eligible for vote");  
	    	 }
	    	
	    	 else {
	    	 System.out.println("You dont have voting card"); 
	    	 }
	       }
	        
	        else {
	    	 System.out.println("You are not eligible");  // if age is value is less that 18 then execute this
	         }
	      } 
      }