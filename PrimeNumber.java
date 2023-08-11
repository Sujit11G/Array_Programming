package com.jsp.Array;

public class PrimeNumber {

	public static void main(String[] args) {
		int a[]=Array.readArray();
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(isPrime(a[i]))
				count++;
			
			System.out.println(a[i]);
		}
		
		System.out.println("From Above no total "+count+" numbers are Prime No");
	}
	
	public static boolean isPrime(int n) {
		
		if (n==1)
			return false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
}
