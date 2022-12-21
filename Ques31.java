package Arrays_PracticeBook;

import java.util.Scanner;

public class Ques31 {
	static int arrElement(int n[],int t)
	{
		for(int i=0;i<n.length;i++)
		{
			if(n[i]==t)
			return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter array element");
		int t=sc.nextInt();
		int p=arrElement(arr,t);
		System.out.println("index of element "+t+" is "+p);

	}

}
