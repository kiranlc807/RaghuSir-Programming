package Array;

import java.util.Scanner;

class ReversArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int n = sc.nextInt();
		int[] ar=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("Reversed Array");
		for(int i=ar.length-1;i>=0;i--) {
			System.out.println(ar[i]);
		}

	}

}
