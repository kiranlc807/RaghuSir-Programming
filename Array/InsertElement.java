package Array;

import java.util.Scanner;

public class InsertElement {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		ArrayOperations ao = new ArrayOperations();
		int[] ar = ao.readArray();
		System.out.println("Enter the element to insert");
		int ele = sc.nextInt();
		System.out.println("Enter the index to insert");
		int in=sc.nextInt();
		int[] res = insertElement(ar,ele,in);
		System.out.println("After the Insertions");
		for(int i:res)
			System.out.println(i);

	}

	static int[] insertElement(int[] x, int ele, int in) {
		if(in<0||in>x.length)
		{
			System.out.println("index is not in range ");
			return x;
		}
		int[] y = new int[x.length+1];
		y[in]=ele;
		for(int i=0;i<x.length;i++)
		{
			if(i<in)
				y[i]=x[i];
			else
				y[i+1]=x[i];
		}
		return y;
	}

}
