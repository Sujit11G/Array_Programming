package com.jsp.Array;

import java.util.Scanner;

public class BinarySearch {

	public static int binarySearch(int element,int a[]) {
		
		int low=0;
		int high=a.length-1;
		
		for(int i=0;i<a.length;i++) {
			int mid=(low+high)/2;
			if(low<=high) {
				if(a[mid]==element) 
				{
				return mid;
				}
				else if(a[mid]<element) 
				{
					low=mid+1;
				}
				else 
				{
					high=mid-1;	
				}
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int a[]=Array.readArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no to be Searched");
		int n=sc.nextInt();
		int b=binarySearch(n,a);	
		System.out.println("Element " + n+" is present at "+b+" index");
	}
	
}
