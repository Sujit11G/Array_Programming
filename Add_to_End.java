package com.jsp.Array;

import java.util.Scanner;

public class Add_to_End {

	public static void main(String[] args) {
	    
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the element to be added at the last");
	    int n=sc.nextInt();
	    int a[]=Array.readArray();
	    
		int b[]=new int[a.length+1];
		
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		b[a.length]=n;
		a=null;
		Array.displayArray(b);
		
	}
	
	
}