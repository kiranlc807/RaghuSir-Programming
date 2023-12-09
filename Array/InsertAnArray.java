package Array;

import java.util.Scanner;

public class InsertAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n1 = sc.nextInt();
		int[] x = new int[n1];
		System.out.println("Enter the Array Element");
		for(int i=0;i<x.length;i++)
		{
			x[i]=sc.nextInt();
		}
		System.out.println("Enter the Second array size");
		int n2 = sc.nextInt();
		int[] y= new int[n2];
		System.out.println("Enter the second Array element");
		for(int i=0;i<y.length;i++)
		{
			y[i]=sc.nextInt();
		}
		System.out.println("Enter the index for insert");
		int n = sc.nextInt();
		int[] rs = insert(x,y,n);
		for(int i:rs)
			System.out.print(i+",");

	}

	static int[] insert(int[] x, int[] y, int n) {
		int[] z = new int[x.length+y.length];
		for(int i=0;i<y.length;i++)
		{
			z[n+i]=y[i];
		}
		for(int i=0;i<x.length;i++)
		{
			if(i<n)
				z[i]=x[i];
			else
				z[i+y.length]=x[i];
		}
		
		
		return z;
		
	}

	
	
	
	
}
