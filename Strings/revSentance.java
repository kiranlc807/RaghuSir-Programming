package Strings;

import java.util.Scanner;

public class revSentance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.nextLine();
		st=revSentance(st);
		System.out.println(st);

	}

	static String revSentance(String st) {
		String[] str = st.split("\\s");
		String revSentance="";
		for(int i=str.length-1;i>=0;i--)
		{
			revSentance=revSentance+str[i]+" ";
		}
		return revSentance;
	}

}
