package Arrays_PracticeBook;

import java.util.Arrays;
import java.util.Scanner;

public class Ques32 {

	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=c.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=c.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			int sm=arr[i];
			for(int j=0;j<arr.length;j++)
			{
				if(sm<arr[j])
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
