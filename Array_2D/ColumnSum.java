package Array_2D;

public class ColumnSum {
	
	static int[] columnWiseSum(int[][] mat)
	{
		int[] sum = new int[mat[0].length];
		for(int i=0;i<mat[0].length;i++)
		{
			int sm = 0;
			for(int j=0;j<mat.length;j++)
			{
				sm = sm + mat[j][i];
			}
			sum[i]=sm;
		}
		return sum;
	}

	public static void main(String[] args) {
		int[][] mat = MatMain.readMat();
		int[] cSum = columnWiseSum(mat);
		for(int i=0;i<cSum.length;i++)
		{
			System.out.println(i+1+" Column wise Sum is: "+cSum[i]);
		}

	}

}
