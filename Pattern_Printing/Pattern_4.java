package Pattern_Printing;

import java.util.Scanner;

public class Pattern_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(j%2+" ");
			}
			System.out.println();
		}
	}
}
