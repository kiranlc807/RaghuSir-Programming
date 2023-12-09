package Convertion;

import java.util.Scanner;

class DecToHexa {
	
	static String decToHex(int dec) {
		String hex="";
		do {
			int r=dec%16;
			if(r<10)
				hex=r+hex;
			else
				hex =(char)(r+55)+hex;
			dec=dec/16;
		}while(dec!=0);
		return hex;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Decimal Number");
		int n = sc.nextInt();
		String hex=decToHex(n);
		System.out.println(hex);

	}

}
