package com.jsp.Array;

import java.util.Scanner;

public class Array {

public static int[] readArray() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Size of Array");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter the Element of Array");
		for(int i=0;i<a.length;i++) {
			
			 a[i]=sc.nextInt();
		}
		return a;
	
	}
	
	public static void displayArray(int a[]) {
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");	
		}
		//System.out.println();
	}
}
