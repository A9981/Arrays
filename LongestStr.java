package Array_Practice;

import java.util.Scanner;

public class LongestStr {
	static String getLongest(String arr[])
	{
		String big=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if((arr[i].length())>(big.length()))
				big=arr[i];
		}
		return big;
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
		String big=getLongest(arr);
		System.out.println("longest String is:"+big);

	}

}
