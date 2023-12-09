package Array;

import java.util.Scanner;

class SumArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int n = sc.nextInt();
		int[] ar=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			sum=sum+ar[i];
		}
		System.out.println("Sum of array:"+sum);

	}

}
