package Array;

import java.util.Scanner;

public class StringRevers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int n = sc.nextInt();
		String[] ar=new String[n];
		System.out.println("enter the array elements");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.next();
		}
		for(int i=ar.length-1;i>=0;i--) {
			System.out.println(ar[i]);
		}

	}

}
