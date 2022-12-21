package Array_Practice;

import java.util.Scanner;

public class BiggestinArr {
	static int getBiggest(int arr[])
	{
		int big=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>big)
				big=arr[i];
		}
		return big;
	}
	static int[] readArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
		  arr[i]=sc.nextInt();
		}
		return arr;
	}
	static void displayArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] x=readArray();
		int big=getBiggest(x);
		displayArray(x);
		System.out.println("biggest is: "+big);
		

	}

}
