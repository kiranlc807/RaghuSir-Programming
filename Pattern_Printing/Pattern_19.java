package Pattern_Printing;

import java.util.Scanner;

public class Pattern_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("    ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("  "+i%2+" ");
			}
			System.out.println();
		}

	}

}
