package com.demo.arrays;

public class TwoDimension {
public static void main(String args[]) {
	int [][] m = new int[3][2];
	m[0][0]=1;
	m[0][1]=2;
	
	m[1][0]=3;
	m[1][1]=4;
	
	m[2][0]=5;
	m[2][1]=6;
	for(int i=0; i<m.length;i++) {
		int[] singleRow = m[i];
		for(int j=0;i<singleRow.length;j++) {
			System.out.println(singleRow[j]+ " ");
		}
		System.out.println(m[i]);
		}
				
	}
			}



