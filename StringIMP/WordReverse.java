package StringIMP;

import java.util.Scanner;

public class WordReverse {
	
	static String revWord(String st)
	{
		char[] ch = st.toCharArray();
		String rs="";
		for(int i=0;i<ch.length;i++)
		{
			int f=i;
			
			while(i<ch.length&&ch[i]!=' ')
			{
				i++;
			}
			
			int l=i-1;
			
			while(f<=l)
			{
				rs=ch[l]+rs;
				l--;
			}
			
			if(i<ch.length)
				rs=ch[i]+rs;
		}
		return rs;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the String");
		String st = sc.nextLine();
		st = revWord(st);
		System.out.println(st);

	}

}
