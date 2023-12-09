package N_Number;

import java.util.Scanner;

class FirstNDiserium {
	
	static int pow(int n,int p) {
		int prod=1;
		while(p>0) {
			prod=prod*n;
			p--;
		}
		return prod;
	}
	
	static boolean isDiseriumNum(int n) {
		int sum =0;
		int temp=n;
		int c = count(n);
		do {
			int r=n%10;
			sum=sum+pow(r,c);
			c--;
			n=n/10;
		}while(n!=0);
		return temp==sum;
	}
	
	static int count(int n) {
		int count=0;
		do {
			count++;
			n=n/10;
		}while(n!=0);
		return count;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N values");
		int n = sc.nextInt();
		for(int i=1;n>0;i++) {
			boolean rs = isDiseriumNum(i);
			if(rs==true) {
				System.out.println(i);
				n--;
		}

	}

	}
}
