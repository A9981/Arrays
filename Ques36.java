package Arrays_PracticeBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ques36 {

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
		ArrayList al1=new ArrayList();
		ArrayList al2=new ArrayList();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==1)
			{
				al1.add(arr[i]);
			}
			else
				al2.add(arr[i]);
		}
		System.out.println(al1);
		System.out.println(al2);
		Object[] a1=al1.toArray();
		Object[] a2=al2.toArray();
		
		int[] c= new int[al1.size()+al2.size()];
		int i=0,j=0;
		while(i<a1.length&&j<a2.length)
		{
			c[j++]=(int) a1[i];
			c[j++]=(int) a2[i++];
		}
		while(i<a1.length)
		{
			c[j++]=(int) a1[i++];
		}
		while(i<a2.length)
		{
			c[j++]=(int) a2[i++];
		}
		System.out.println(Arrays.toString(arr));
		

	}

}
