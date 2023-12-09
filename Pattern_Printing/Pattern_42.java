package Pattern_Printing;

import java.util.Scanner;

public class Pattern_42 {

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
			int x=1;
			for(int j=1;j<=st;j++)
			{
				if(j!=st)
				{
					System.out.print(x+"  ");
					System.out.print("*  ");
					x++;
				}	
				else
				{
					System.out.print(x+"  ");
				}
			}
			if(i<=n/2)
			{
				sp--;
				st++;
			}
			else
			{
				sp++;
				st--;
			}
			System.out.println();
		}

	}

}
