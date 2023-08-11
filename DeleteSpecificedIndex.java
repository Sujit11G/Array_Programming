package com.jsp.Array;

import java.util.Scanner;

public class DeleteSpecificedIndex {

	public static int[] deleteAt(int index,int a[]) {
		int b[]=new int [a.length-1];
		
		for(int i=0;i<index;i++) {
			b[i]=a[i];
		}
		for(int i=index+1;i<a.length;i++) {
			b[i-1]=a[i];
		}
		return b;
	}
	
	public static void main(String[] args) {
		int a[]=Array.readArray();
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the index no to be delete");
	  int index=sc.nextInt();
		
		if(index<0||index>a.length) {
			return;
		}
	      int b[]=deleteAt(index,a);
	      Array.displayArray(b);
	}
}
 