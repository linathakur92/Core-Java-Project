package com.encapsulation;

import java.util.Scanner;

public class TestEncapsEx3 {
	
	public static void main(String[] args) {
		System.out.println("take the value from user");
		Scanner s = new Scanner(System.in);
		    int v =s.nextInt();
		    
		    EncapEx3 e = new EncapEx3();
		             e.setP(v);
		             e.setQ(v);
		             
		             e.getP();
		             e.getQ();
		             
		             
	}

}
