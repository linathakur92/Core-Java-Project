package com.ifexample;

public class IfEx {
	
	int i =20;
	int j=30;
// here we have a non static variable so we can not acess in main method so we have to creat new non static method  and we have to 
	//call non static method in main method by creating object
	public static void main(String[] args) {
		IfEx e = new IfEx();
		     e.m1();
		
		}
	public void m1() {
		if (i>j) {
			System.out.println(" i is not gretter than j");
		}
		else {
			System.out.println("j is gretter than i");
		}
		
	}
			
	

}
