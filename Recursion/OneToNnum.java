package Recursion;

import java.util.Scanner;

public class OneToNnum {
	
	static void display(int n)
	{
		if(n>1)
			display(n-1);
		
		System.out.print(n+" ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		display(n);
	}

}
