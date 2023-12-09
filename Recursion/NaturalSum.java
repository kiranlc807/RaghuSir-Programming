package Recursion;

import java.util.Scanner;

public class NaturalSum {
	
	static int naturalSum(int n)
	{
		if(n==0)
			return 0;
		
		return n+naturalSum(n-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int sum=naturalSum(n);
		System.out.println("Sum of N Natural Number "+sum);
	}

}
