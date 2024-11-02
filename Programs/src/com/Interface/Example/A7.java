package com.Interface.Example;

public class A7 implements Printable {
 
	public  void print() {
		System.out.println("Hello");
	}
	public void Show() {
		System.out.println("Welcome");
	}
	public static void main(String args[]) {
		A7 obj = new A7();
		obj.print();
		obj.Show();
	}
}


