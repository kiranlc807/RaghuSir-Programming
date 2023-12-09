package Pattern_Printing;

import java.util.Scanner;

public class Pattern_27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("   ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(" "+(char)(j+64)+" ");
			}
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" "+(char)(j+64)+" ");
			}
			System.out.println();
		}

	}

}
