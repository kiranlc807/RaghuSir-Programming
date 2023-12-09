package Convertion;

import java.util.Scanner;

class OctalToDecimal {
	
	static int octToDec(int oct) {
		int dec=0,p=1;
		do {
			int r=oct%10;
			dec=dec+r*p;
			p=p*8;
			oct=oct/10;
		}while(oct!=0);
		return dec;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Octal Number");
		int n = sc.nextInt();
		int dec=octToDec(n);
		System.out.println(dec);

	}

}
