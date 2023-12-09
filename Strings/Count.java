package Strings;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.next();
		int ul=0,ll=0,spc=0,dc=0;
		for(int i=0;i<st.length();i++)
		{
			char ch = st.charAt(i);
			if(ch>='A'&&ch<='Z')
				ul++;
			else if(ch>='a'&&ch<='z')
				ll++;
			else if(ch>'0'&&ch<='9')
				dc++;
			else
				spc++;
		}
		System.out.println("Upper case :"+ul+"\n"+"Lower case :"+ll+"\n"+"Digits :"+dc+"\n"+"Special Character :"+spc);

	}

}
