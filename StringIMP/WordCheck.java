package StringIMP;

import java.util.Scanner;

public class WordCheck {
	
	static boolean checkWord(String ms,String ss) {
		
		char[] mc = ms.toCharArray();
		char[] sc = ss.toCharArray();
		for(int i=0;i<mc.length;i++)
		{
			int f=i;
			int j=0;
			while(f<mc.length&&j<sc.length&&mc[f]==sc[j]) 
			{
				f++;
				j++;
			}
			if(j==sc.length)
			{
				if((f==mc.length||mc[f]==' ')&&(i==0||mc[i-1]==' '))
					return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  main String");
		String st = sc.nextLine();
		System.out.println("Enter the sub String");
		String st2 = sc.nextLine();
		boolean rs = checkWord(st,st2);
		System.out.println(rs);

	}

}
