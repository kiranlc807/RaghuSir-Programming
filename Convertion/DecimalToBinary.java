package Convertion;

import java.util.Scanner;

class DecimalToBinary {
	
	static String decToBin(int dec) {
		String bin = "";
		do {
			int r=dec%2;
			bin=r+bin;
			dec=dec/2;
		}while(dec!=0);
		return bin;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Decimal number");
		int n = sc.nextInt();
		String bn = decToBin(n);
		System.out.println(bn);
	}

}
