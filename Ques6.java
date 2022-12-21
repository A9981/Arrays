package Arrays_PracticeBook;
import java.util.Arrays;

import java.util.Scanner;

public class Ques6 {
	static boolean isPrime(int n)
	{
		int count=0;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			return false;;
		}
		return true;
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
		int prime=0;
		System.out.println("Entered array element is: "+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			boolean rs=isPrime(arr[i]);
			if(rs)
				prime++;
		}
		System.out.println("the number of prime numbers are: "+prime);
		
	}

}
