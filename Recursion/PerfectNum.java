package Recursion;

import java.util.Scanner;

public class PerfectNum {
	
	static boolean isPerfectNum(int n) {
		
		return isPerfectNum(n,1,0);
	}
	
	static boolean isPerfectNum(int n,int i,int sum)
	{
		if(i>n/2)
			return n==sum;
		if(n%i==0)
			sum=sum+i;
		
		return isPerfectNum(n,++i,sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		boolean rs = isPerfectNum(n);
		if(rs)
			System.out.println("Perfect Number");
		else
			System.out.println("Not a Perfect Number");

	}

}
