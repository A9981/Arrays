package Array_Practice;

import java.util.Scanner;

public class SmallestStr {

	static String getLongest(String arr[])
	{
		String small=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i].length())<(arr[0].length()))
				small=arr[i];
		}
		return small;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		String[] arr=new String[n];
		System.out.println("enter array element");
		for(int i=0;i<arr.length;i++)
		{
		  arr[i]=sc.next();
		}
		String small=getLongest(arr);
		System.out.println("Smallest String is:"+small);

	}

}
