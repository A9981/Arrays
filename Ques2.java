package Arrays_PracticeBook;

import java.util.Scanner;

public class Ques2 {

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
		int small=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<small)
				small=arr[i];
		}
		System.out.println("the smallest element is "+small);

	}

}
