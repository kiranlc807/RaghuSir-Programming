package Pattern_Printing;

import java.util.Scanner;

public class Patter_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int x=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("   ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
//				if(i%2!=0)
//					System.out.print(" "+j%2+" ");
//				else if(j%2==0)
//					System.out.print(" "+1+" ");
//				else
//					System.out.print(" "+0+" ");
				System.out.print(" "+x%2+" ");
				x++;
			}
			System.out.println();
		}

	}

}
