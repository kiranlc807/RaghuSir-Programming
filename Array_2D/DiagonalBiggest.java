package Array_2D;

public class DiagonalBiggest {
	
	static int[] diagonalBig(int[][] mat)
	{
		int fbig = Integer.MIN_VALUE;
		int sbig = Integer.MIN_VALUE;
		for(int i=0;i<mat.length;i++)
		{
			if(mat[i][i]>fbig)
				fbig = mat[i][i];
			if(mat[i][mat.length-1-i]>sbig)
				sbig = mat[i][mat.length-1-i];	
		}
		int[] big = {fbig,sbig};
		return big;
		
	}

	public static void main(String[] args) {
		int[][] mat = MatMain.readMat();
		int[] res = diagonalBig(mat);
		
		System.out.println("first Diagonal Biggest is: "+res[0]);
		System.out.println("Second Diagonal Biggest is: "+res[1]);

	}

}
