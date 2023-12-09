package Strings;

import java.util.Scanner;

public class Digitcount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.next();
		int count=0;
		for(int i =0 ;i<st.length();i++)
		{
			char ch = st.charAt(i);
			if(ch>=48&&ch<=57)
				count++;
		}
		System.out.println("Digit count is: "+count);

	}

}
