package Strings;

import java.util.Scanner;

public class ConvertToUpper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		str = toUpper(str);
		System.out.println(str);

	}

	static String toUpper(String str) {
		char[] ch = str.toCharArray();
		for(int i = 0 ;i<ch.length;i++)
		{
			if(ch[i]>='a'&&ch[i]<='z')
				ch[i]=(char) (ch[i]-32);
		}
		str =new String(ch);
		return str;
	}
	
	static String toLower(String st) {
		char[] ch = st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A'&&ch[i]<='Z')
				ch[i]=(char)(ch[i]+32);
		}
		st=new String(ch);
		return st;
	}

}
