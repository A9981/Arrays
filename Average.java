package Array_Practice;

import java.util.Scanner; 

public class Average {
	static double avgofArray(int[] a)
	{
		double sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		double avg=sum/a.length;
		return avg;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter array element");
		for(int i=0;i<arr.length;i++)
		{
		  arr[i]=sc.nextInt();
		}
		double avg=avgofArray(arr);
		System.out.println("Average of array element is: "+avg);
	}

}
