package com.jsp.Array;

public class ReverseArray {

	public static void main(String[] args) {
		
		int a[]=Array.readArray();
		
		
		for(int i=a.length-1;i>=0;i--){
			System.out.println(a[i]);
			
		}
		System.out.println();
	}
}
