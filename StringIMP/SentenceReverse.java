package StringIMP;

import java.util.Scanner;

public class SentenceReverse {
	
	static String revSentence(String st)
	{
		char[] ch = st.toCharArray();
		String rs="";
		for(int i=ch.length-1;i>=0;i--)
		{
			int f=i;
			while(i>=0&&ch[i]!=' ')
			{
				i--;
			}
			int l=i+1;
			while(f>=l)
			{
				rs=rs+ch[l];
				l++;
			}
			if(i>=0)
				rs=rs+ch[i];
		}
		return rs;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.nextLine();
		st=revSentence(st);
		System.out.println(st);

	}

}
