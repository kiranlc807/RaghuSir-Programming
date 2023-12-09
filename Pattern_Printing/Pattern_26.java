package Pattern_Printing;

import java.util.Scanner;

public class Pattern_26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j<i)
					System.out.print(j+" * ");
				else
					System.out.print(j+"  ");
			}
			System.out.println();
		}

	}

}
