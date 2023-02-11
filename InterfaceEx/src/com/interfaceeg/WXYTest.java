package com.interfaceeg;

import java.util.Scanner;

public class WXYTest implements Y{
	
	public static void main(String[] args) {
		System.out.println(" Enter the value");
		Scanner s = new Scanner(System.in);
		    int p = s.nextInt();
		    System.out.println("Enter the Second Value");
		        int q = s.nextInt();
		        
		WXYTest wxytest = new WXYTest();
		        wxytest.m1(p, q);
	}

	@Override
	public void m1(int a, int b) {
	System.out.println(a+b);
		
	}

	@Override
	public void m2(int c, int d) {
		
		
	}

	@Override
	public void m3() {
		
		
	}

}
