package com.method;

public class Example {
	
	public static void test() {    // Static method
		
		System.out.println(" This is Static method");  // Printing Statement
	}
   
	// Entry Point of Programe Execution;
	
	public static void main(String[] args) {    // Main Method
		 
		Example.test();  // Calling Static method by Using ClassName
		
		Example example = new Example(); // Object Creation 
		
		example.test(); // Calling static method by using object
		 
		test();  // Calling Static method by its name if it is same Class
	
	}
}
