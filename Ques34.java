package Arrays_PracticeBook;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ques34 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int arr1[]=new int[arr.length];
		System.out.println(Arrays.toString(arr));
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]==arr[j])
//				{
//					if(j<arr.length-1)
//					arr[j]=arr[j+1];
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
//		second way
		LinkedHashSet ln=new LinkedHashSet();
		for(int i=0;i<arr.length;i++)
		{
			ln.add(arr[i]);
		}
		System.out.println(ln);
	}

}
