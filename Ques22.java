package Arrays_PracticeBook;

import java.util.Arrays;
import java.util.Scanner;

public class Ques22 {
	static void mergeArray(int ar1[],int ar2[]) {
		int arr3[]=new int[ar1.length+ar2.length];
		int j=0;
		for(int i=0;i<arr3.length;i++)
		{
			if(i<ar1.length)
				arr3[i]=ar1[i];
			else
			{
				arr3[i]=ar2[j];
				j++;
			}
			
		}
		System.out.println(Arrays.toString(arr3));
		
		
	}
			
	static int[] array()
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		System.out.println("Enter no of first array element");
		int arr1[]=array();
		System.out.println(Arrays.toString(arr1));
		System.out.println("Enter no of second array element");
		int arr2[]=array();
		System.out.println(Arrays.toString(arr2));
		System.out.println("merged array element: ");
		mergeArray(arr1,arr2);
	}

}
