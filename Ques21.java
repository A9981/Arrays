package Arrays_PracticeBook;

import java.util.Arrays;
import java.util.Scanner;

public class Ques21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of array element");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int i=0;
		int j=arr.length-1;
		int st=arr.length/2;
		while(i<=st)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(arr));
		

	}

}
