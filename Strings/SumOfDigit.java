package Strings;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>='0'&&ch<='9')
			
				sum = sum+ch-48;
			
				
		}
		System.out.println("Sum of Digit in String: "+sum);

	}

}
