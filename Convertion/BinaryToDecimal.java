package Convertion;

import java.util.Scanner;

class BinaryToDecimal {
	
	static int binToDec(int bin) {
		int dec = 0,p=1;
		do{
			int r=bin%10;
			dec=dec+r*p;
			p=p*2;
			bin=bin/10;
		}while(bin!=0);
		return dec;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Binary Number");
		int n=sc.nextInt();
		int dec = binToDec(n);
		System.out.println(dec);

	}

}
