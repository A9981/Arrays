package Arrays_PracticeBook;

//=============Sorted Array===============

import java.util.Arrays;
import java.util.Scanner;

public class Ques27 {

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
		static int[] sortedArray(int[] ar1,int[] ar2)
		{
			int arr3[]=new int[ar1.length+ar2.length];
			int i=0,j=0,k=0;
			while(i<ar1.length&&j<ar2.length)
			{
				if(ar1[i]<ar2[i])
					arr3[k++]=ar1[i++];
				else
					arr3[k++]=ar2[j++];
			}
			while(i<ar1.length)
				arr3[k++]=ar1[i++];
			while(i<ar2.length)
				arr3[k++]=ar2[j++];
			
			return arr3;
			
		}
		

		public static void main(String[] args) {
			System.out.println("enter size of first array");
			int arr1[]=readArray();
			System.out.println(Arrays.toString(arr1));
			System.out.println("enter size of second array");
			int arr2[]=readArray();
			System.out.println(Arrays.toString(arr2));
			int arr[]=sortedArray(arr1,arr2);
			System.out.println(Arrays.toString(arr));
			for(int i=0;i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]>arr[j])
					{
					    int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}	
			}
			System.out.println(Arrays.toString(arr));
			
		}

}
