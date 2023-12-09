package N_Number;

import java.util.Scanner;

class Neon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			boolean rs = isNeon(i);
			if(rs==true)
				System.out.println(i);
		}

	}
	
	static boolean isNeon(int n) {
		int num = n*n;
		int sum=0;
		do {
			int r = num%10;
			sum=sum+r;
			num=num/10;
		}while(num!=0);
	
		return sum==n;
	}

}
