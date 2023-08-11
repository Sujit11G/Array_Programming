package com.jsp.Array;

import java.util.Scanner;

public class LargestElement {

	public static void main(String[] args) {
		int a[]= {1,9,5,7,2,3,8};
		
		System.out.print("Enter the value of k to find the kth largest number: ");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			if(i==k-1) {
				System.out.println(a[i]);
				//break;
			}
			
			
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		//System.out.println(temp);
	}
}
