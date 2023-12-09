package Recursion;

import java.util.Scanner;

public class ArraySum {
	
	static int elementSum(int[] ar)
	{
		return add(0,0,ar);
	}
	
	static int add(int sum, int i, int[] ar)
	{
		if(i==ar.length)
			return sum;
		
		
		return add(sum+ar[i],i+1,ar);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int n = sc.nextInt();
		int[] ar = new int[n];
		System.out.println("Enter the Array Elements");
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();
		}
		
		int sum = elementSum(ar);
		System.out.println("Sum of the Array Elements is "+sum);

	}

}
