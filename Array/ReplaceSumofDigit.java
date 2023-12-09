package Array;

import java.util.Scanner;

class ReplaceSumofDigit {
	
	static int[] readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array Size");
		int n=sc.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();		
			}
		return ar;
	}
	
	static int sumOfDigit(int n) {
		int sum=0;
		do {
			int r=n%10;
			sum=sum+r;
			n=n/10;
		}while(n!=0);
		return sum;
	}

	public static void main(String[] args) {
		int[] ar=readArray();
		for(int i=0;i<ar.length;i++) {
			ar[i]=sumOfDigit(ar[i]);
		}
		System.out.println("After Suming the digit");
		for(int i:ar) {
			System.out.println(i);
		}

	}

}
