package Strings;

import java.util.Scanner;

public class SwapFctoLc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.nextLine();
		st=swapFctoLc(st);
		System.out.println(st);

	}

	static String swapFctoLc(String st) {
		int f=0;
		char[] ch =st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' '&& i==0||ch[i]!=' '&&ch[i-1]==' ')
				f=i;
			else if(i==ch.length-1&&ch[i]!=' '|| ch[i]!=' '&&ch[i+1]==' ')
			{
				char temp=ch[f];
				ch[f]=ch[i];
				ch[i]=temp;
			}
		}
		st=new String(ch);
		return st;
		
	}

}
