package com.jsp.Array;

public class EvenArray {

	public static void main(String[] args) {
		int a[]=Array.readArray();
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)
				count++;
		}
		System.out.println(count);
	}
}
