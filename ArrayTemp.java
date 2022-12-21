package Arrays_PracticeBook;

import java.util.Arrays;
import java.util.Scanner;


//=================Ques36 odd before even====================



public class ArrayTemp {

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
		int arr1[]=new int[n];
		int k=0;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==1)
			{
				arr1[k++]=arr[i];
				for(int j=0;j<arr.length;j++)
				{
					if(arr[j]%2==0)
					{
						arr1[k++]=arr[j];
						arr[j]=-1;
						break;
					}
					
				}
			}
		}
		System.out.println(Arrays.toString(arr1));

	}

}
