package N_Number;

import java.util.Scanner;

class WithInPrime {
	
	static boolean isPrime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int sum=0;
		int count=0;
		for(int i=2;i<=n;i++) {
			boolean rs = isPrime(i);
			if(rs==true) {
				System.out.println(i);
				count++;
				sum=sum+i;
			}
		}
		System.out.println("-------");
		System.out.println("total count is: "+count);
		System.out.println("-------");
		System.out.println("sum of prime number with in "+n+" is: "+sum);
	}

}
