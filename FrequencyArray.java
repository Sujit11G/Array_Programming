package com.jsp.Array;

public class FrequencyArray {

	public static void main(String[] args) {
		int a[]=Array.readArray();
		boolean b[]=new boolean[a.length];
		
		for(int i=0;i<a.length;i++) {
			if(b[i]==false) {
				int count=1;
				
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						count++;
						b[j]=true;
					}
					
				}
				System.out.println(a[i]+" presents "+count+" times");
			}
		}
	}
}
