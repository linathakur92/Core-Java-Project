package com.encapsulation;

import java.util.Scanner;

public class EncapTest {

	
 public static void main(String[] args) {
	System.out.println("take first value ");
	 Scanner s = new Scanner(System.in);
	     int t  = s.nextInt();
	     
	     System.out.println("Take the second Value");
	     
	        int  r  = s.nextInt();
	        
	 EncapEx e = new EncapEx();
	         e.setP(t);
	         e.setQ(r);
	 System.out.println(" get the first Variable value" + e.getP());
	 System.out.println(" Get the second Variable value" + e.getQ());
	 
	 
}
}
