package StringIMP;

import java.util.Scanner;

public class CountOfSubString {
	
	static int countStr(String ms,String ss)
	{
		char[] mc=ms.toCharArray();
		char[] sc=ss.toCharArray();
		int count=0;
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
				count++;
				i=f-1;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st1 = sc.nextLine();
		System.out.println("Enter the Sub String");
		String st2 = sc.nextLine();
		int count = countStr(st1,st2);
		System.out.println(count);

	}

}
