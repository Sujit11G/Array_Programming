package com.jsp.Array;

public class SumArray {
	public static void main(String[] args) {
		int a[]=Array.readArray();
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}	
		System.out.println(sum);
	}	
}
