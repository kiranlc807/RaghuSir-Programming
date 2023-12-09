package N_Number;

import java.util.Scanner;

class ArmstrongNum {
	
	static boolean isArmstrong(int n) {
		int temp=n;
		int sum=0;
		do {
			int r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}while(n!=0);
		return temp==sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		for(int i=100;i<=999;i++) {
			boolean rs = isArmstrong(i);
			if(rs==true)
				System.out.println(i);
		}

	}

}
