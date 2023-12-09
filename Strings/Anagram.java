package Strings;

import java.util.Scanner;

public class Anagram {
	
//	static boolean isAnagram(String st1 , String st2)
//	{
//		if(st1.length()!=st2.length())
//			return false;
//		
//		String str1=sortArray(st1);
//		String str2=sortArray(st2);
//		int i=0,j=0;
//		while(i<str1.length())
//		{
//			if(str1.charAt(i)!=str2.charAt(j))
//				return false;
//			
//			i++;
//			j++;
//		}
//		return true;
//		
//	}
//	
//	static String sortArray(String str)
//	{
//		char[] ch = str.toCharArray();
//		for(int i=0;i<ch.length;i++)
//		{
//			for(int j=i+1;j<ch.length;j++)
//			{
//				if(ch[j]<ch[i])
//				{
//					char temp = ch[j];
//					ch[j]=ch[i];
//					ch[i]=temp;
//				}
//			}
//		}
//		str = new String(ch);
//		return str;
//	}
	
	static boolean checkAnagram(String st1,String st2) {
		int[] c1 = countFrequency(st1);
		int[] c2 = countFrequency(st2);
		
		for(int i=0;i<26;i++)
		{
			if(c1[i]!=c2[i])
				return false;
		}
		return true;
	}
	
	static int[] countFrequency(String str) {
		
		int[] count=new int[26];
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>='A'&&ch<='Z')
				count[ch-65]++;
			else if(ch>='a'&&ch<='z')
				count[ch-97]++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String");
		String st1 = sc.nextLine();
		System.out.println("Enter the Second String");
		String st2 = sc.nextLine();
		boolean rs = checkAnagram(st1,st2);
		if(rs==true)
			System.out.println(st1+" and "+st2+" is Anagram");
		else
			System.out.println(st1+" and "+st2+" is not an Anagram");
		
	}

}
