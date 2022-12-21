package Arrays_PracticeBook;

import java.util.Scanner;

public class Ques3 {

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
		int big=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>big)
				big=arr[i];
		}
		System.out.println("the biggest element is "+big);

	}

}
