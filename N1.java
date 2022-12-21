package Arrays_PracticeBook;

import java.util.Scanner;
public class N1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
int sum=0;
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<arr.length;i++)
{
int num=arr[i];
do
{
int r=num%10;
sum=sum+r;
num=num/10;
}while(num!=0);
arr[i]=sum;
}
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
}

}
