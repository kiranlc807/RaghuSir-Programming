package Pattern_Printing;

import java.util.Scanner;

public class Pattern_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}

	}

}
