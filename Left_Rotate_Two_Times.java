package com.jsp.Array;

public class Left_Rotate_Two_Times {

	public static int [] leftRotate(int a[],int n ) {
		
		for(int i=0;i<n;i++) {
			int first=a[0]; int j;
			for(j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[j]=first;
		}
		return a;
		
	}
public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
	int b[]=leftRotate(a,2);
	
	for(int n:b) {
		System.out.print(n+" ");
	}
	
	}
}
