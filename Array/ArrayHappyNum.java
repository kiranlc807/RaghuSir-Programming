package Array;

import java.util.Scanner;

class ArrayHappyNum {
	
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
	
	static boolean isHappyNum(int n) {
		
		while(n>9) {
			int sum=0;
			do {
				int r=n%10;
				sum=sum+r*r;
				n=n/10;
			}while(n!=0);
		n=sum;
		}
		return n==1||n==7;
	}

	public static void main(String[] args) {
		int[] ar=readArray();
		int count=0;
		for(int i=0;i<ar.length;i++) {
			boolean rs = isHappyNum(ar[i]);
			if(rs==true)
				count++;
		}
		System.out.println("Number Of HappuNum is:"+count);
		

	}

}
