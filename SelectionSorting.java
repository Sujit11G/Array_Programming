package com.jsp.Array;

public class SelectionSorting {

	public static int[] selectionSorting(int a[]) {
		
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[i]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}	
			}
		}
		return a;
	}
	public static void main(String[] args) {
		int a[]=Array.readArray();
		int b[]= selectionSorting(a);
		Array.displayArray(b);
		
	}
}
