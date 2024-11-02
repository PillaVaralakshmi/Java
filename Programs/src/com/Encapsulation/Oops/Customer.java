package com.Encapsulation.Oops;
import java.util.Scanner;
public class Customer {
	private int Cid;
	private String Cname;
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	
  public static void main(String args[]) {
	  Customer C= new Customer();
	  Scanner S = new Scanner (System.in);
	  System.out.println("Enter Cid");
	  int Cid = S.nextInt();
	  C.setCid(Cid);
	  System.out.println("Enter Cname");
	  String Cname=S.next();
	  C.setCname(Cname);
	  System.out.println("Cid="+ C.getCid());
	  System.out.println("Cname="+ C.getCname());
	  
	  
  }
}
