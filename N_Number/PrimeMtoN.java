package N_Number;

import java.util.Scanner;

class PrimeMtoN {
	
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
		for(int i=2;n>0;i++) {
			boolean rs = isPrime(i);
			if(rs==true) {
				System.out.println(i);
				n--;
			}
		}

	}

}
