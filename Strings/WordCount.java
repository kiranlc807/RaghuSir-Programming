package Strings;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.nextLine();
		int count= countWord(st);
		System.out.println("Word count is: "+count);

	}

	static int countWord(String st) {
		char[] ch = st.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=0&&ch[i-1]==' ')
				count++;
		}
		return count;
	}

}
