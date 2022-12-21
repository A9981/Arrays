package Arrays_PracticeBook;

import java.util.Arrays;
import java.util.Scanner;

public class Ques9 {
	static boolean primeIS(int n)
	{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
					return false;
			}
			return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of array element");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<=100)
			{
				boolean rs=primeIS(arr[i]);
				if(rs)
					count++;
			}
		}
		System.out.println("no of prime numbers present under 100 in array is "+count);

	}

}
