package com.Polymorphism.Oops;

public class OverloadExample {
		    
	    // Method to add two integers
	    public int add(int a, int b) {
	        return a + b;
	    }
	    
	    // Method to add three integers
	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }
	    
	    public static void main(String[] args) {
	        OverloadExample example = new OverloadExample();
	        
	        // Calling the overloaded methods
	        System.out.println("Sum of 5 and 10 is: " + example.add(5, 10));
	        System.out.println("Sum of 15, 30, and 25 is: " + example.add(15, 30, 25));
	        
	    }
	}
	 


