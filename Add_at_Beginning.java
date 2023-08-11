package com.jsp.Array;

import java.util.Scanner;

public class Add_at_Beginning {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no to be added at beginning");
		int n=sc.nextInt();
		int a[]=Array.readArray();
		int b[]=new int[a.length+1];
		b[0]=n;
		for(int i=0;i<a.length;i++) {
			b[i+1]=a[i];
		}
		Array.displayArray(b);
	}
}
