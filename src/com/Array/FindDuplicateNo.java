package com.Array;

public class FindDuplicateNo {

	public static void main(String[] args) {

		int a[]= {2,5,4,1,2,1,3,3,5,4,7};
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(a[i]==a[j])
				 {
					 System.out.println(a[j]);
				 }
			 }
		 }
	}
}
