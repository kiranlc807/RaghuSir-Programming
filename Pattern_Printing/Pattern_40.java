package Pattern_Printing;

import java.util.Scanner;

public class Pattern_40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		int sp=n/2;
		int st=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print("   ");
			}
			int x=st/2+1;
			for(int j=1;j<=st;j++)
			{
				if(j<=st/2)
				{
					System.out.print(x%2+"  ");
					x--;
				}
				else
				{
					System.out.print(x%2+"  ");
					x++;
				}
			}
			if(i<=n/2)
			{
				sp--;
				st=st+2;
			}
			else 
			{
				sp++;
				st=st-2;
			}
			System.out.println();
		}

	}

}
