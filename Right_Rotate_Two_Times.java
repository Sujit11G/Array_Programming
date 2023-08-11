package com.jsp.Array;

public class Right_Rotate_Two_Times {
	
	public static int [] rightRotate(int a[],int n) {
		
		for(int i=0;i<n;i++) {
			
			int last=a[a.length-1]; int j;
			
			for(j=a.length-1;j>0;j--) {
				a[j]=a[j-1];
			}
			a[0]=last;
		}

			return a;
			
		}
	public static void main(String[] args) {
			
			int a[]= {1,2,3,4,5,6};
		int b[]=rightRotate(a,2);
		
		for(int n:b) {
			System.out.print(n+" ");
		}
		
		}
	}

