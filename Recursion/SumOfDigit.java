package Recursion;

import java.util.Scanner;

public class SumOfDigit {
	
	static int sumOfDigit(int n) {
		
		if(n==0)
			return 0;
		
		return n%10+sumOfDigit(n/10);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int sum = sumOfDigit(n);
		System.out.println("Sum of Digit is "+sum);

	}

}
