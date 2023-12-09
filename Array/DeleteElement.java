package Array;
import java.util.*;

public class DeleteElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayOperations so = new ArrayOperations();
		int[] ar= so.readArray();
		System.out.println("enter the element");
		int ele = sc.nextInt();
		System.out.println("Enter the index");
		int in = sc.nextInt();
		int[] res = delete(ar,ele,in);
		for(int i:res)
			System.out.println(i);
	}
	
	static int[] delete(int[] x,int ele,int in)
	{
		if(in<0||in>=x.length) {
			System.out.println("Index not in range");
			return x;
		}
		int[] y = new int[x.length-1];
		for(int i =0;i<x.length-1;i++) {
			if(i<in)
				y[i]=x[i];
			else
				y[i]=x[i+1];
		}
		return y;
		
	}

}
