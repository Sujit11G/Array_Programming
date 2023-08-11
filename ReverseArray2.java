package com.jsp.Array;

public class ReverseArray2 {

	public static int [] reverseArray(int a[]) {
		int b[]=new int[a.length];
		for(int i=0;i<b.length;i++) {
			b[i]=a[a.length-1-i];
		}
		
//		Using Swapping Method
//		for(int i=0;i<a.length/2;i++) {
//			int temp=a[i];
//			a[i]=a[a.length-1-i];
//			a[a.length-1-i]=temp;
//		}
//		return a;
		
		return b;
	}
	
	public static void main(String[] args) {
		
		int a[]=Array.readArray();
		a=reverseArray(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
		
	}
}
