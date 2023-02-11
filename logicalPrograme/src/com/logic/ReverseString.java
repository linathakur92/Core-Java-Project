package com.logic;

public class ReverseString {
	
	static String s= "abc";
	 static String revstr = "";
	 static char ch;
	 public static void main(String[] args) {
		
		 for(int i=0; i<s.length();i++) {
			  
			 ch = s.charAt(i);
			 revstr=ch+revstr;
			
			 
		 }
		 System.out.println("reverse string :"+ revstr);
	}

}
