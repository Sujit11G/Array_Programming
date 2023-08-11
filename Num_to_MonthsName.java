package com.jsp.Array;

import java.util.Scanner;

public class Num_to_MonthsName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Month: ");
		int n=sc.nextInt();
		
		String months[]= {"","Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};
		
		if(n>0&&n<13)
			System.out.println(months[n]);
		else
			System.out.println("Invalid Month Number");
	}
}
