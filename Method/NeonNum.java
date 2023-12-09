package Method;

import java.util.Scanner;

class NeonNum {
	
	static boolean isNeonNum(int n) {
		int num=n*n;
		int sum =0;
		do {
			int r=num%10;
			sum=sum+r;
			num=num/10;
		}while(num!=0);
		return n==sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		boolean rs = isNeonNum(n);
		if(rs==true)
			System.out.println(n+" is a Neon Number");
		else 
			System.out.println(n+" is not Neon Number");

	}

}


