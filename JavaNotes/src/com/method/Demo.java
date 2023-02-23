package com.method;

// WAP To Define a NonStatic Method and Call Non Static Method

public class Demo {

	public void test() {    // Non Static Method 
		
		System.out.println("This is non Static method"); //Printing Statement
		
	}
	
	public static void main(String[] args) {    // Main method
		 
		Demo demo = new Demo();   // Call Non Static method by using Object
		     demo.test();         
	}

}
