package com.jsp.Array;

public class Merge_two_Array {

	public static int[] to_merge_Array(int a[],int b[]) {
		
		int c[]=new int[a.length+b.length];
		
		
		
//		while(i=a.length) {
//			c[j]=a[i];
//			i++;
//			j++;
//		}
//		
//		i=0;
//		while(i<b.length) {
//			c[j]=b[i];
//			i++;
//			j++;
//		}
		for(int i=0;i<c.length;i++) {
			if(i<a.length)
				c[i]=a[i];
			else 
				c[i]=b[i-a.length];
		}
	
		
			
		
		return c;
	}
	
	public static void main(String[] args) {
		System.out.println("First Array");
		int a[]=Array.readArray();
		
		System.out.println("Second Array");
		int b[]=Array.readArray();
		
		int c[]=to_merge_Array(a,b);
		Array.displayArray(c);
		
	
		
		
	}
}
