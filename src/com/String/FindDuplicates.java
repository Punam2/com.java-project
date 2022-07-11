package com.String;
public class FindDuplicates {

	public static void main(String[] args) {
		
		String str1="Punamun Raiei";
		char[] str=str1.toCharArray();
		System.out.println(" Duplicates =");
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i]==str[j])
				{
					System.out.println(str[i]);
				}
			}
		}
		
	}
}
