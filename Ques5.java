package Arrays_PracticeBook;

import java.util.Scanner;

public class Ques5 {
	static double avgArrayElement(int ar[])
	{
		double sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
		}
		return sum/ar.length;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of Student");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		double arg=avgArrayElement(arr);
		System.out.println("Average of array elements is: "+arg);
	}
}