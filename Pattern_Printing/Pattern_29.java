package Pattern_Printing;

import java.util.Scanner;

public class Pattern_29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int x=n-1;
			int temp=0;
			for(int j=1;j<=i;j++)
			{	if(j==1)
				{
					System.out.print(i+" ");
					temp=i;
				}
				else
				{
					temp=temp+x;
					System.out.print(temp+" ");
					x--;	
				}
			}
			System.out.println();
		}

	}

}
