package Method;

import java.util.Scanner;

class Xylem_Phoiem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		String s = checkXP(n);
		System.out.println(s);

	}
	
	static String checkXP(int n) {
		int ex=0;
		int ms=0;
		int x=n;
		do {
			int r=n%10;
			if(x==n||r==n)
				ex=ex+r;
			else
				ms=ms+r;
			n=n/10;
		}while(n!=0);
		if(ex==ms)
			return "Xylem";
		else
			return "Phloeim";
	}

}
