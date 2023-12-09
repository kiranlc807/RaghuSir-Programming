package StringIMP;

import java.util.Scanner;

public class SubStringCheck {
	
	static boolean isSubStr(String ms,String ss) {
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
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st1 = sc.nextLine();
		System.out.println("Enter the Sub String");
		String st2 = sc.nextLine();
		boolean rs = isSubStr(st1,st2);
		if(rs)
			System.out.println("The Sub String is Present");
		else
			System.out.println("The Sub String is Not Present");
	}

}
