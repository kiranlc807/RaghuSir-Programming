package Pattern_Printing;

import java.util.Scanner;

public class Pattern_44 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		int sp=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				if(j==1||j==sp||i==1||i==n||i==j||i+j==n+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
