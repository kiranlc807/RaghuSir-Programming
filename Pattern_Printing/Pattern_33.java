package Pattern_Printing;

import java.util.Scanner;

public class Pattern_33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j=i-1;j>=1;j--)
			{
				System.out.print("   ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(" "+j+" ");
			}
			for(int j=4;j>=i;j--)
			{
				System.out.print(" "+j+" ");
			}
			System.out.println();
		}

	}

}
