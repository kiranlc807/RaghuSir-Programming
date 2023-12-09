package Method;

import java.util.Scanner;

class Paliendrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		boolean rs  = isPaliendrom(n);
		if(rs==true)
			System.out.println(n+" is a paliendrome number");
		else
			System.out.println(n+" is not a paliendrome number");
	}
	
	static boolean isPaliendrom(int n) {
		int temp=n;
		int rev=0;
		do {
			int r = n%10;
			rev=rev*10+r;
			n=n/10;
		}while(n!=0);
		
		return temp==rev;
	}

}
