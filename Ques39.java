package Arrays_PracticeBook;

import java.util.Arrays;
import java.util.Scanner;

public class Ques39 {

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
		Arrays.sort(arr);
		System.out.println("Second largest element in an array is "+arr[arr.length-2]);
		System.out.println("Second Smallest element in an array is "+arr[1]);

	}

}
