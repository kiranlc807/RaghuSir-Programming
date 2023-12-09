package Method;

import java.util.Scanner;

class DisariumNum {
	
	/*static int pow(int n,int p) {
		int prod = 1;
		while(p!=0) {
			prod=prod*n;
			p--;
		}
		return prod;
	}*/
	static int pow(int n,int p) {
		int prod=1;
		for(int i=0;i<p;i++) {
			prod=prod*n;
		}
		return prod;
	}
	
	static int count(int n) {
		int count = 0;
		do {
			count++;
			n=n/10;
		}while(n!=0);
		return count;
	}
	
	static boolean disarium(int n) {
		int temp=n;
		int sum=0;
		int c=count(n);
		do {
			int r=n%10;
			sum=sum+pow(r,c);
			c--;
			n=n/10;
		}while(n!=0);
		return temp==sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();
		boolean rs = disarium(n);
		if(rs==true)
			System.out.println(n+" is Desarium Number");
		else
			System.out.println(n+" is Not a Desarium Number");

	}

}
