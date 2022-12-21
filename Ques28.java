package Arrays_PracticeBook;

import java.util.Arrays;
import java.util.Scanner;

public class Ques28 {
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

	public static void main(String[] args) {
		System.out.println("enter size of first array");
		int arr1[]=readArray();
		System.out.println(Arrays.toString(arr1));
		System.out.println("enter size of second array");
		int arr2[]=readArray();
		System.out.println(Arrays.toString(arr2));
		String st="";
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					st=st+arr1[i];
					st=st+" ";
				}
			}
		}
		System.out.println(st.toCharArray());
	}

}
