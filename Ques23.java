package Arrays_PracticeBook;

import java.util.Arrays;
import java.util.Scanner;

public class Ques23 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("enter index of array");
		int a=sc.nextInt();
		System.out.println("enter element");
		int j=sc.nextInt();
		int brr[]=new int[arr.length+1];
		if(a>brr.length||a<0)
			System.out.println("index not in the array");
		else
		{
			brr[a]=j;
			for(int i=0;i<arr.length;i++)
			{
				if(i<a)
					brr[i]=arr[i];
				else
					brr[i+1]=arr[i];
			}
		}
		System.out.println(Arrays.toString(brr));

	}

}
