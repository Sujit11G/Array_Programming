package com.jsp.Array;

public class BubbleSorting {

public static int[] bubbleSorting(int a[]) {
		
		int temp=0;
		for(int i=0;i<a.length;i++) {
			boolean b=true;
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					b=false;
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}	
			}
			if(b==true)
				break;
		}
		return a;
	}
public static void main(String[] args) {
	int a[]=Array.readArray();
	int b[]= bubbleSorting(a);
	Array.displayArray(b);
	
}
}
