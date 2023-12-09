package Array_2D;

public class ColumnSmall {
	
	static int[] columnWiseSmallest(int[][] mat)
	{
		int[] small = new int[mat[0].length];
		for(int i=0;i<mat[0].length;i++)
		{
			int sm=mat[0][i];
			for(int j=1;j<mat.length;j++)
			{
				if(mat[j][i]<sm)
					sm=mat[j][i];
			}
			small[i]=sm;
		}
		return small;
	}

	public static void main(String[] args) {
		int[][] mat = MatMain.readMat();
		int[] colSmall = columnWiseSmallest(mat);
		for(int i=0;i<colSmall.length;i++)
		{
			System.out.println(i+1+"Row Smallest elements"+colSmall[i]);
		}

	}

}
