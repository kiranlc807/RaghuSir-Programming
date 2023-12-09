package Strings;

import java.util.Scanner;

public class Paliendrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		boolean rs = isPaliendrom(str);
		if(rs==true)
			System.out.println(str+" is Paliendrome");
		else
			System.out.println(str+" is not a Paliendrome");

	}

	static boolean isPaliendrom(String str) {
		int f = 0,l=str.length()-1;
		while(f<l) 
		{
			if(str.charAt(f)!=str.charAt(l))
				return false;
			f++;
			l--;
		}
		return true;
	}

}
