package Array;

import java.util.Scanner;

class AvgOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int n = sc.nextInt();
		int[] ar=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		double sum=0;
		for(int i=0;i<ar.length;i++) {
			sum=sum+ar[i];
		}
		double avg=sum/ar.length;
		System.out.println("Average of array:"+avg);
	}

}


