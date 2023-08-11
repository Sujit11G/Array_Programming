package com.jsp.Array;

public class TwoDigits {

	//public static void main(String[] args) {
//		int a[]=Array.readArray();
//		int count=0;
//		for(int i=0;i<a.length;i++) {
//			if(a[i]/10!=0&&a[i]/100==0)
//				count++;
//		}
//		System.out.println(count);
		
	//	System.out.println(isTwoDigit());
		
		
	//}
	
	public static boolean isTwoDigit() {
		int a[]=Array.readArray();

		for(int i=0;i<a.length;i++) {
			if ((a[i]>9)&&(a[i]<100))
				return true;
			else
				return false;
		}
		
			return false;
	}
}
