package Array_Practice;

import java.util.Scanner;

public class SmallestArr {
	static int getSmallest(int arr[])
	{
		int small=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<small)
				small=arr[i];
		}
		return small;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
		  arr[i]=sc.nextInt();
		}
		int small=getSmallest(arr);
		System.out.println(small);
	}
}
