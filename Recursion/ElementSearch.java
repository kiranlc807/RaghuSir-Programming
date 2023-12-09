package Recursion;

import java.util.Scanner;

public class ElementSearch {
		
	static int isPresent(int ele,int[] ar) {
		
		return check(0,ele,ar);
	}
	
	static int check(int i,int ele,int[] ar)
	{
		if(i==ar.length)
			return -1;
		
		if(ar[i]==ele)
			return i;
		return check(i+1,ele,ar);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int n = sc.nextInt();
		int[] ar = new int[n];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		System.out.println("Enter the searching elements in array");
		int ele = sc.nextInt();
		
		int in = isPresent(ele,ar);
		System.out.println(in);
			

	}

}
