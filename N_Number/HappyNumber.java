package N_Number;

import java.util.Scanner;

class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			boolean rs = isHappy(i);
			if(rs==true)
				System.out.println(i);
		}

	}
	
	static boolean isHappy(int n) {
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

}
