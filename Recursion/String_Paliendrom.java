package Recursion;

import java.util.Scanner;

public class String_Paliendrom {
	
	static boolean isPaliendrom(String st)
	{
		return pali(st.length()-1,0,st);
	}
	
	static boolean pali(int l, int f, String st)
	{
		if(f>l)
			return true;
		
		if(st.charAt(f)!=st.charAt(l))
			return false;
		
		return pali(l-1,f+1,st);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.next();
		boolean rs = isPaliendrom(st);
		if(rs)
			System.out.println("The given String is Paliendrome");
		else
			System.out.println("The given String is not Paliendrome");

	}

}
