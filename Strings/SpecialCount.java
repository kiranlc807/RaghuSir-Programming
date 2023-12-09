package Strings;

import java.util.Scanner;

public class SpecialCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		int count = countSpecial(str);
		System.out.println("Special Character Count is: "+count);

	}

	static int countSpecial(String str) {
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if((ch>=65&&ch<=90||ch>=97&&ch<=122||ch>=48&&ch<=57)==false)
				count++;
		}
		return count;
	}

}
