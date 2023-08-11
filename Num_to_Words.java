package com.jsp.Array;

import java.util.Scanner;

public class Num_to_Words {

	public static void num_to_Words(int n,String s) {
		if(n==0)
			return;
		
		String ones[]= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelev","Thirteen","Fourteen","Fifteen","Sisxteen","Seventeen","Eighteen","Nineteen"};
		String tens[]= {"","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		
		if(n<20) {
			System.out.print(ones[n]+" ");
		}else {
			System.out.print(tens[n/10]+" "+ones[n%10]+" ");
		}
		System.out.print(s+" ");	
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numeric Value");
		int n=sc.nextInt();
		
		 num_to_Words(n/10000000,"Crore");
		 num_to_Words((n/100000)%100,"Lakhs");
		 num_to_Words((n/1000)%100,"Thousand");
		 num_to_Words((n/100)%10,"Hundred");
		 num_to_Words(n%100,"");	
	}
}