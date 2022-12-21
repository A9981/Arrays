package Arrays_PracticeBook;

import java.util.Arrays;
import java.util.Scanner;

public class Ques37 {

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
		int EN=0,OD=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				EN++;
			else
				OD++;
		}
		System.out.println("even numbers are-> "+EN);
		System.out.println("odd numbers are-> "+OD);

	}

}
