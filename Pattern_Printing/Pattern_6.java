package Pattern_Printing;

import java.util.Scanner;

public class Pattern_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i%2!=0)
					System.out.print(j%2+" ");
				else
				{
					if(j%2==0)
						System.out.print(1+" ");
					else
						System.out.print(0+" ");
				}
			}
			System.out.println();
		}

	}

}
