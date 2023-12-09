package Array;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int[] ar = new int[n];
		System.out.println("Enter the array element");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		int ecount=0;
		int ocount=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0)
				ecount++;
			else 
				ocount++;
		}
		System.out.println("Even Count is:"+ecount+"\n"+"Odd count is:"+ocount);

	}

}
