package N_Number;

import java.util.Scanner;

class Paliendrom {
	
	static boolean isPaliendrom(int n) {
		int temp=n,sum=0;
		do {
			int r= n%10;
			sum=sum*10+r;
			n=n/10;
		}while(n!=0);
		return temp==sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			boolean rs = isPaliendrom(i);
			if(rs==true)
				System.out.println(i);
		}

	}

}
