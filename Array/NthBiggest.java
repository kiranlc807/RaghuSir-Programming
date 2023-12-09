package Array;
import java.util.Scanner;

public class NthBiggest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayOperations ao = new ArrayOperations();
		int[] ar = ao.readArray();
		System.out.println("Enter the nth value");
		int n= sc.nextInt();
		int count=0;
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length;j++) {
				if(ar[j]>ar[i])
				{
					count++;
				}
			}
			if(count==n-1)
				System.out.println(ar[i]);
		}
//		int a=ao. nthBiggest(ar,n);
//		System.out.println(a+" is the " +n+"th biggest number");

	}

}
