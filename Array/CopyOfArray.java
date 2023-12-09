package Array;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

class CopyOfArray {
	
	static int[] readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array Size");
		int n=sc.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();		
			}
		return ar;
	}

	public static void main(String[] args) {
		int[] ar=readArray();
		int[] ar2=new int[ar.length];
		for(int i=0;i<ar.length;i++) {
			ar2[i]=ar[i];
		}
		System.out.println("Copied Array Elements");
		for(int i: ar2) {
			System.out.println(i);
			
		}

	}

}
