package com.jsp.Array;

public class UniqeElement {

	public static int uniqeElement(int a[]) {
		int uniq=a[0];
		for(int i=1;i<a.length;i++) {
			uniq=uniq^a[i];
		}
		return uniq;
		
	}
	public static void main(String[] args) {
		
		int a[]= {1,2,1,3,3,5,2};
	
	int b=uniqeElement(a);
	  System.out.println(b);
	}
}
