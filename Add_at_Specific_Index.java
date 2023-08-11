package com.jsp.Array;

import java.util.Scanner;

public class Add_at_Specific_Index {

	public static int [] toSpecificIndex(int index,int element,int a[]) {
		
		int b[]=new int [a.length+1];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		b[index]=element;
		for(int i=index;i<a.length;i++) {
			b[i+1]=a[i];
		}
		return b;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=Array.readArray();
		System.out.println("Enter the index");
		int ind=sc.nextInt();
		System.out.println("Enter the element to be added at index ");
		int elem=sc.nextInt();
		
		int b[]=toSpecificIndex(ind, elem,a);
		Array.displayArray(b);
	}
}
