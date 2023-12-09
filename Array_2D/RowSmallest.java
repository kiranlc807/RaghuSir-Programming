package Array_2D;

public class RowSmallest {
	
	static int[] rowWiseSmallest(int[][] mat)
	{
		int[] small = new int[mat.length];
		for(int i=0;i<mat.length;i++)
		{
			int sm=mat[i][0];
			for(int j=1;j<mat[i].length;j++)
			{
				if(mat[i][j]<sm)
					sm=mat[i][j];
			}
			small[i]=sm;
		}
		return small;
	}

	public static void main(String[] args) {
		int[][] mat = MatMain.readMat();
		
		int[] rowSmall = rowWiseSmallest(mat);
		
		for(int i=0;i<rowSmall.length;i++)
		{
			System.out.println(i+1+"Row Smallest elements"+rowSmall[i]);
		}
		
	}

}
