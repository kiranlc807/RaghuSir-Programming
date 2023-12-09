package StringIMP;

import java.util.Scanner;

public class SunStringcount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the main String");
		String st1 = sc.nextLine();
		System.out.println("Enter the sub String");
		String st2 = sc.nextLine();
		int count = subStringCount(st1,st2);
		System.out.println(count);

	}

	static int subStringCount(String st1, String st2) {
		int count=0;
		char[] mc = st1.toCharArray();
		char[] sc = st2.toCharArray();
		for(int i=0;i<mc.length;i++)
		{
			int f=i;
			int j=0;
			while(f<mc.length&&j<sc.length&&mc[f]==sc[j])
			{
				j++;
				f++;
			}
			if(j==sc.length)
			{
				if((f==mc.length-1||mc[f]==' ')&&(i==0||mc[i-1]==' '))
					{
						count++;
						i=f-1;
					}
			}
		}
		return count;
	}

}
