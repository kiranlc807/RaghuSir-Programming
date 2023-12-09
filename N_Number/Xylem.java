package N_Number;

import java.util.Scanner;

class Xylem {
	
	static boolean isXylem(int n) {
		int es=0;
		int ms=0;
		int x=n;
		do {
			int r = n%10;
			if(x==n||r==n)
				es=es+r;
			else
				ms=ms+r;
			n=n/10;
		}while(n!=0);
		return es==ms;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			boolean rs = isXylem(i);
			if(rs==true)
				System.out.println(i);
		}

	}

}
