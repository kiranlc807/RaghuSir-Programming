package Pattern_Printing;

import java.util.Scanner;

public class Pattern_34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
//		for(int i=n;i>=1;i--)
//		{
//			for(int j=i-1;j>=1;j--)
//			{
//				System.out.print("   ");
//			}
//			//int x=n;
//			for(int j=n;j>=i;j--)
//			{
//				System.out.print(" "+j+" ");
//			}
//			for(int j=i+1;j<=n;j++)
//			{
//				System.out.print(" "+j+" ");
//			}
//			System.out.println();
//		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("   ");
			}
			int x=n;
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(" "+(char)(x+64)+" ");
				if(j<i)
					x--;
				else
					x++;
			}
			System.out.println();
		}

	}

}
