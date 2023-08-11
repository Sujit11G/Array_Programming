package com.jsp.Array;

import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int n,int a[]) {
		
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
				return i;
			}
			
		}
		return -1;
	}
	public static void main(String[] args) {
		int a[]=Array.readArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no to be Searched");
		int n=sc.nextInt();
		int b=linearSearch(n,a);
		
		System.out.println("Element " + n+" is present at "+b+" index");
	}
}
