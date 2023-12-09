package Strings;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		int oc=0,cc=0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				oc++;
			else
				cc++;
		}
		System.out.println("Owels count: "+oc+"\n"+"Cc : "+cc);

	}

}
