package N_Number;

import java.util.Scanner;

class SumPerfectNum {
	static boolean isPerfectNum(int n) {
		int sum=0,temp=n;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0)
				sum=sum+i;
		}
		return sum==temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		int n = sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			boolean rs = isPerfectNum(i);
			if(rs==true)
				sum=sum+i;
		}
		System.out.println("Sum of PerfectNum B/W "+n+" is :"+sum);

	}

}
