package Array_2D;

public class Right90Degree {
	
	static int[][] right90Degree(int[][] mat)
	{
		int[][] res  = transposeMat(mat);
		int[][] mat1 = rowWiseReverse(res);
		
		return mat1;
	}
	
	static int[][] transposeMat(int[][] mat)
	{
		for(int i=0;i<mat.length;i++)
		{
			for(int j=i+1;j<mat.length;j++)
			{
				int temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;
			}
		}
		return mat;
	}
	
	static int[][] rowWiseReverse(int[][] mat)
	{
		for(int i=0;i<mat.length;i++)
		{
			int f=0;
			int l=mat[0].length-1;
			while(f<l)
			{
				int temp = mat[i][f];
				mat[i][f] = mat[i][l];
				mat[i][l]=temp;
				f++;
				l--;
			}
		}
		return mat;
	}
	public static void main(String[] args) {
		int[][] mat = MatMain.readMat();
		System.out.println("User Entered Matrix is");
		MatMain.dispMat(mat);
		System.out.println("After 90 Degree Right Rotation ");
		int[][] res = right90Degree(mat);
		MatMain.dispMat(res);

	}

}
