package Arrays_PracticeBook;

import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class Ques38 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		ArrayList al1=new ArrayList();
		ArrayList al2=new ArrayList();
		for(int s:arr)
		{
			if(s%2==0)
			{
				al1.add(s);
			}
			else
				al2.add(s);
		}
		System.out.println("even elements are-> "+al1+"size "+al1.size());
		System.out.println("odd elements are-> "+al2);
		
		

	}

}
