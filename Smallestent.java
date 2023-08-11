package com.jsp.Array;

public class Smallestent {

	public static void main(String[] args) {
		int a[]=Array.readArray();
		int min=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<min)
				min=a[i];	
		}
		System.out.println(min);
	}
}
