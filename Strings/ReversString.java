package Strings;

import java.util.Scanner;

public class ReversString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		str = reverse(str);
		System.out.println(str);
		

	}

	static String reverse(String str) {
		char[] ch = str.toCharArray();
		int f = 0;
		int l = ch.length-1;
		while(f<l)
		{
			char temp = ch[f];
			ch[f] = ch[l];
			ch[l] = temp;
			f++;
			l--;
		}
		str = new String(ch);
		return str;
	}

}
