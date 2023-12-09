package Method;

import java.util.Scanner;

class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		boolean rs = isHappyNum(n);
		if(rs==true)
			System.out.println(n+" is a Happy Number");
		else 
			System.out.println(n+" is not Happy Number");

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

}
