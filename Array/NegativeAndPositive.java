package Array;

import java.util.Scanner;

class NegativeAndPositive {
	
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
	
	static int[] posNeg(int[] ar) {
		int Pc=0;
		int Nc=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>=0)
				Pc++;
			else
				Nc++;
		}
		int[] count= {Pc,Nc};
		return count;
	}

	public static void main(String[] args) {
		int[] ar=readArray();
		int[] ct = posNeg(ar);
		System.out.println("Positive count is:"+ct[0]);
		System.out.println("Negative count is:"+ct[1]);
	}

}
