package Array;

import java.util.Scanner;

public class ArrayPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int n = sc.nextInt();
		int[] ar=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("Prime Numbers are");
		for(int i=0;i<ar.length;i++) {
			int count=0;
			for(int j=2;j<=ar[i]/2;j++) {
				if(ar[i]%j==0)
					count++;
			}
			if(count==0)
				System.out.println(ar[i]);
			count=0;
		}

	}

}
