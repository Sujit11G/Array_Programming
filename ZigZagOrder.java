package com.jsp.Array;

public class ZigZagOrder {

	public static int[] mergeZigZagOrder(int a[],int b[]) {
		
		int c[]=new int[a.length+b.length];
		
		int i=0;
		int j=0;
		while(i<c.length) {
			if(j<a.length) {
				c[i]=a[j];
			i++;
			}if (j<b.length) {
				c[i]=b[j];
			i++;
			}
			j++;
		}
		return c;
	}
	
	public static void main(String[] args) {
		System.out.println("First Array");
		int a[]=Array.readArray();
		
		System.out.println("Second Array");
		int b[]=Array.readArray();
		
		int c[]=mergeZigZagOrder(a,b);
		Array.displayArray(c);	
	}
}
