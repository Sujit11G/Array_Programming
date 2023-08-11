package com.jsp.Array;

public class MaxSubArray {

	public static int maxSubArray(int a[]) {
		int maxsum=0;
		int currsum=0;
		for(int i=0;i<a.length;i++) {
			currsum=currsum+a[i];
			if(currsum>maxsum) {
				maxsum=currsum;
			}
			if(currsum<0) {
				currsum=0;
			}
		}
		return maxsum;
	}
	
	public static void main(String[] args) {
		int a[]=Array.readArray();
		int b=maxSubArray(a);
		for(int i=0;i<a.length;i++) {
			
		}
		System.out.println("Maximum sum of SubArray is "+b);
	}
}
