package Method;

import java.util.Scanner;

class StrongNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		boolean rs = strong(n);
		if(rs==true)
			System.out.println(n+" is Strong Number");
		else
			System.out.println(n+" is Not a Strong Number");

	}
	
	static boolean strong(int n) {
		int fact=1;
		int temp=n;
		int sum=0;
		do {
			int r = n%10;
			for(int i=1;i<=r;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			fact=1;
			n=n/10;
		}while(n!=0);
		
		return temp==sum;
	}

}
