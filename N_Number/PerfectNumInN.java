package N_Number;

import java.util.Scanner;

public class PerfectNumInN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i/2;j++) {
				if(i%j==0)
					sum=sum+j;
			}
			if (i==sum)
				System.out.println(i);
			sum=0;
		}

	}

}
