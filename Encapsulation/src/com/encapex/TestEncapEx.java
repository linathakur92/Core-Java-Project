package com.encapex;

import java.util.Scanner;

public class TestEncapEx {

	public static void main(String[] args) {
		System.out.println("get the Salary from user");
		Scanner s =new Scanner (System.in);
		    int   p =s.nextInt();
		System.out.println(" get the id from user");
		    int  q = s.nextInt();
		    EncapEx e = new EncapEx();
		            e.setSalary(p);
		            e.setId(q);
		            
		        System.out.println("get Salary from User:"+ e.getSalary());
		        System.out.println("get Id from user"+e.getId());
		
	}
}
