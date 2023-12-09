package Strings;

import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.nextLine();
		boolean rs = isPanagram(st);
		if(rs)
			System.out.println("String is Panagram");
		else
			System.out.println("String is not Panagram");
	}

	static boolean isPanagram(String st) {
		int[] count=new int[26];
		for(int i=0;i<st.length();i++)
		{
			char ch = st.charAt(i);
			if(ch>='A'&&ch<='Z')
				count[ch-65]++;
			else if(ch>='a'&&ch<='z')
				count[ch-97]++;
		}
		
		for(int i=0;i<count.length;i++) {
			if(count[i]==0)
				return false;
		}
		return true;
	}

}
