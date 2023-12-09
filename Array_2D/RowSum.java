package Array_2D;

public class RowSum {
	
	static int[] rowWiseSum(int[][] mat)
	{
		int[] sum = new int[mat.length];
		for(int i=0;i<mat.length;i++)
		{
			int sm=0;
			for(int j=0;j<mat[i].length;j++)
			{
				sm=sm+mat[i][j];
			}
			sum[i]=sm;
		}
		return sum;
	}

	public static void main(String[] args) {
		int[][] mat = MatMain.readMat();
		int[] rSum = rowWiseSum(mat);
		for(int i=0;i<rSum.length;i++)
		{
			System.out.println(i+1+" Row Sum is: "+rSum[i]);
		}

	}

}
