package Strings;

import java.util.Scanner;

public class CountWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String str = sc.nextLine();
		int c = wordCount(str);
		System.out.println("Word Count is :"+c);
	}

	static int wordCount(String str) {
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch==' ')
				count++;
		}
		count++;
		if(str.charAt(0)==' ')
			count--;
		
		if(str.charAt(str.length()-1)==' ')
			count--;
		
		return count;
	}

}
