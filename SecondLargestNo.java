package com.jsp.Array;

public class SecondLargestNo {

	public static void main(String[] args) {
		int a[]=Array.readArray();
	
		int max=a[0];
		int min=a[0];
		int max2=min;
		for(int i=0;i<a.length;i++) {
		
			if(a[i]>max)
				max=a[i];
			else if(a[i]<min)
			min=a[i];	
		}
		
		if(max!=min)
			 max2=min;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]<max&&a[i]>max2)
				max2=a[i];
			
		}
		
		
		System.out.println(max2);
	}
}
