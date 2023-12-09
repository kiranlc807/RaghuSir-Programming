package N_Number;

import java.util.Scanner;

class PerfectNumMethod {
	
	static boolean isPerfectNum(int n) {
		int sum=0,temp=n;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0)
				sum=sum+i;
		}
		return temp==sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			boolean rs = isPerfectNum(i);
			if(rs==true)
				System.out.println(i);
		}

	}
	
	

}
