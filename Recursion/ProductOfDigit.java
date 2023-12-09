package Recursion;

import java.util.Scanner;

public class ProductOfDigit {
	
	static int proOfDigit(int n)
	{
		if(n==0)
			return 1;
		
		return n%10*proOfDigit(n/10);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int pro = proOfDigit(n);
		System.out.println("Product of Digit is "+pro);

	}

}
