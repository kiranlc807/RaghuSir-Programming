package Array_2D;

import java.util.Scanner;

public class MatMain {

	static int[][] readMat(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Row and Column Size");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] mat = new int[row][col];
		System.out.println("Enter "+row*col+" values");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		return mat;
	}

	static void dispMat(int[][] mat) {
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

	static int biggest(int[][] mat)
	{
		int big = Integer.MIN_VALUE;
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				if(mat[i][j]>big)
					big=mat[i][j];
			}
		}
		return big;
	}
	
	static int samllest(int[][] mat)
	{
		int small=Integer.MAX_VALUE;
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				if(mat[i][j]<small)
					small=mat[i][j];
			}
		}
		return small;
	}
	
	static int matSum(int[][] mat)
	{
		int sum=0;
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				sum=sum+mat[i][j];
			}
		}
		return sum;
	}
  
}
