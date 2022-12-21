package Arrays_PracticeBook;

import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of Student");
		int n=sc.nextInt();
		double arr[]=new double[n];
		System.out.println("enter percentage of Student");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextDouble();
		}
		double big=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>big)
				big=arr[i];
		}
		System.out.println("highest percentage of among student is "+big+" %");
		
		

	}

}
