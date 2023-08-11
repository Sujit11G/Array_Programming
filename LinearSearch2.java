package com.jsp.Array;

public class LinearSearch2 {

	public static int lineraSearch(int a[],int n) {
		
		int i;
		for( i=0;i<a.length;i++) {
			if(a[i]==n) {
				return i+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
			
			int a[]= {1,4,5,6,9};
		int b=lineraSearch(a, 4);
		
		System.out.println(b);
		

	}
}
