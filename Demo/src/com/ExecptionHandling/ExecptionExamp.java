package com.ExecptionHandling;

public class ExecptionExamp {
 public static void main(String args[]) {
	 System.out.println(5+3);
	 System.out.println(6*2);

	 try {
		 
		 System.out.println(10/0);
		
	 }
	 catch(ArithmeticException e) {
		 System.out.println("please don't divide by zero");
	 }
	finally {
		System.out.println("Hi");
	}
		 
	 
 }
 
}

