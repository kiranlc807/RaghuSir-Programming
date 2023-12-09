package Array;

import java.util.Scanner;

public class ArrayOperations {
	
	
	public int[] readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int n = sc.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Array Element");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		return ar;

	}
	
	public void display(int[] ar) {
		System.out.println("The Entered Array is");
		for(int i:ar) {
			System.out.print(i+" ");
		}
	}
	
	
	public int biggest(int[] ar) {
		int big=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>big)
				big=ar[i];
		}
		return big;
	}
	
	public int smallest(int[] ar) {
		int small=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<small)
				small=ar[i];
		}
		return small;
	}
	
	public int[] countEO(int[] ar) {
		int[] count= {0,0};
		for(int i=0;i<ar.length;i++) {
			count[ar[i]%2]++;
		}
		
		return count;
	}
	
	public int[] merge(int[] x,int[] y) {
		
		int[] z=new int[x.length+y.length];
		for(int i=0;i<x.length;i++) {
			z[i]=x[i];
		}
		
		for(int i=0;i<y.length;i++) {
			z[i+x.length]=y[i];
		}
		
		return z;
	}
	
	public int[] sortArray(int[] x, int[] y) {
		int[] z = new int[x.length+y.length];
		int i=0,j=0,k=0;
		while(i<x.length&&j<y.length) {
			if(x[i]<y[j])
			{
				z[k]=x[i];
				i++;
			}
			else
			{
				z[k]=y[j];
				j++;
			}
			k++;
		}
		while(i<x.length) {
			z[k]=x[i];
			i++;
			k++;
		}
		while(j<y.length) {
			z[k]=y[j];
			j++;
			k++;
		}
		return z;
	}
	
	public int secongBiggestElement(int[] x) {
		int fbig=Integer.MIN_VALUE;
		int sbig = Integer.MIN_VALUE;
		for(int i=0;i<x.length;i++) {
			if(x[i]>fbig)
			{
				sbig=fbig;
				fbig=x[i];
			}
			else if(x[i]>sbig&&x[i]!=fbig)
			{
				sbig=x[i];
			}
		}
		return sbig;
	}
	
	public int nthBiggest(int[] x,int n) {
		int count=0;
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x.length;j++) {
				if(x[i]>x[j]) {
					count++;
				}
			}
			if(count==n-1)
				return x[i];
		}
		return 0;
	}
	
	public int removeDuplication(int[] n) {
		int j=0;
		int[] temp = new int[n.length];
		for(int i=0;i<n.length-1;i++) {
			if(n[i]!=n[i+1])
			{
				temp[j]=n[i];
				j++;
			}
		}
		temp[j++]=n[n.length-1];
		
		for(int i=0;i<temp.length;i++) {
			n[i]=temp[i];
		}
		
		return j;
		
	}
	
	public int[] insert(int[] x,int ele,int in)
	{
		if(in<0||in>x.length)
		{
			System.out.println("Array index renge is not found");
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
	
	public int[] delete(int[] x,int ele,int in)
	{
		if(in<0||in>x.length)
		{
			System.out.println("Array inder out of range");
			return x;
		}
		int[] y = new int[x.length-1];
		{
			if(i<in)
				y[i]=x[i];
			else
				y[i]=x[i+1];
		}
		return y;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
