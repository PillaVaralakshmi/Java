package com.demo.arrays;

public class TwoDimension1 {
public static void main(String args[]) {
	int[][] arr = {{1,2},{3,4},{5,6}};
	int size = 0;
	for(int i=0; i<arr.length;i++) {
		for(int j=0; j<arr.length;j++) {
			System.out.println(arr[i][j] + " ");
		}
		System.out.println();
	}
}
}