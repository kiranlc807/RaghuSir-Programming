package Recursion;

import java.util.Scanner;

public class ReveseNum {
	
	
	static int  reverse(int sum,int n)
	{
		
		if(n==0)
		{
			return sum;
		}
		return reverse(sum*10+n%10,n/10);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum=0;
		int num=reverse(sum,n);
		System.out.println(n+" Reverse is "+num);
	}

}
