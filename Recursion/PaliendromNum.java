package Recursion;

import java.util.Scanner;

public class PaliendromNum {
	
	static boolean isPaliendrom(String st)
	{
		return isPaliendrom(st,0,st.length()-1);
	}
	
	static boolean isPaliendrom(String st , int f, int l)
	{
		if(f>l)
			return true;
		
		if(st.charAt(f)!=st.charAt(l))
			return false;
		
		return isPaliendrom(st, f+1, l-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		String st=n+"";
		boolean rs=isPaliendrom(st);
		if(rs)
		{
			System.out.println(n+" is Paliendrom");
		}
		else
		{
			System.out.println(n+" is not Paliendrom");
		}

	}

}
