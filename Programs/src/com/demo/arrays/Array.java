package com.demo.arrays;

import java.util.Scanner;

public class Array {
	
	
		public static void main(String args[]){
			Scanner s=new Scanner(System.in);
			int arr[]=new int[7];
			
			int evenarr[]=new int[7];
			int oddarr[]=new int[7];
			for(int i=0;i<3;i++) {
				System.out.println("enter a number:");
				int x=s.nextInt();
				arr[i]=x;
				
			}
	 for(int i=0;i<3;i++) {
		 if(arr[i]%2==0) {
			 evenarr[i]=arr[i];
			 System.out.println(evenarr[i]);
		 }
	 }
	 for(int i=0;i<3;i++){
		 if(arr[i]%2==1){
			 oddarr[i]=arr[i];
			 System.out.println(oddarr[i]);
		 }
	 }

	  
	  }
	}

