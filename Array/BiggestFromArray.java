package Array;

import java.util.Scanner;

class BiggestFromArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int[] ar = new int[n];
		System.out.println("Enter the array element");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		int big=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>big)
				big=ar[i];
		}
		System.out.println("Biggest values is:"+big);

	}

}
