package Arrays_PracticeBook;

import java.util.Arrays;
import java.util.Scanner;

//===================Zig-Zag array element=====================

public class Ques26 {
	static int[] readArray()
	{
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int arr[]=new int[s];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	static int[] zigZag(int[] ar1,int[] ar2)
	{
		int arr3[]=new int[ar1.length+ar2.length];
		int i=0,j=0;
		while(i<ar1.length&&i<ar2.length)
		{
			arr3[j++]=ar1[i];
			arr3[j++]=ar2[i++];
		}
		while(i<ar1.length)
			arr3[j++]=ar1[i++];
		while(i<ar2.length)
			arr3[j++]=ar2[i++];
		
		return arr3;
		
	}
	

	public static void main(String[] args) {
		System.out.println("enter size of first array");
		int arr1[]=readArray();
		System.out.println(Arrays.toString(arr1));
		System.out.println("enter size of second array");
		int arr2[]=readArray();
		System.out.println(Arrays.toString(arr2));
		int arr[]=zigZag(arr1,arr2);
		System.out.println(Arrays.toString(arr));
		
		
	}

}
