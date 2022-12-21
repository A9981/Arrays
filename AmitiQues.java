package Arrays_PracticeBook;

import java.util.Scanner;

public class AmitiQues {
	static String evenTimes(String str,char ch,int n)
	{
		while(n>1)
		{
			str=str+ch;
			n--;
		}
		return str;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input string");
		String str1=sc.next();
		char ch[]=str1.toCharArray();
		String st="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0'&&ch[i]<='9')
			{
				if(isDigit (ch[i+1]))
				{
					String st1=""+ch[i]+ch[i+1];
					int p=Integer.parseInt(st1);
					if(p%2==0)
					st=evenTimes(st,ch[i+2],p);
					
				}
		    	else if((ch[i]-48)%2==0)
				{
					int k=ch[i]-48;
					char j=ch[i+1];
					st=evenTimes(st,j,k);
				}
				else
				{
					st=st+ch[i];
				}
			}
			else
			{
				st=st+ch[i];
			}
			
		}
		System.out.println(st);
		

	}

	 static boolean isDigit(char c) {
		if(c>='0' && c<='9')
			return true;
		
		return false;
	}

}
