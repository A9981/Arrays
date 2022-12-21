package Arrays_PracticeBook;

import java.util.Arrays;
import java.util.Scanner;

public class Ques29 {
	static boolean magicNum(int n)
	{
		while(n>9) {
			int sum=0;
			while(n!=0) {
				sum=sum+n%10;
				n=n/10;
			}
				n=sum;
		}
			return n==1;
	}

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter size of array");
			int n=sc.nextInt();
			int arr[]=new int[n];
			System.out.println("enter array elements");
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.println("Entered array elements are: "+Arrays.toString(arr));
			for(int i=0;i<arr.length;i++)
			{
				boolean rs=magicNum(arr[i]);
				if(rs)
					System.out.print(arr[i]+" ");
			}
		}

	}