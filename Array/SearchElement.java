package Array;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayOperations so = new ArrayOperations();
		int[] ar = so.readArray();
		System.out.println("Enter the element");
		int n = sc.nextInt();
		int rs = searchIndex(ar,n);
		
		if(rs>=0)
			System.out.println("index is:"+rs);
		else
			System.out.println(-1);
	}
	
	static int searchIndex(int[] ar,int n) {
		int a=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==n)
				a=i;
				
		}
		return a;
	}

}
