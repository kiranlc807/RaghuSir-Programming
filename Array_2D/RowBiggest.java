package Array_2D;

public class RowBiggest {
	
	static int[] rowWiseBig(int[][] mat)
	{
		int[] big = new int[mat.length];
		for(int i=0;i<mat.length;i++)
		{
			int bg=mat[i][0];
			for(int j=1;j<mat[i].length;j++)
			{
				if(mat[i][j]>bg)
					bg=mat[i][j];
			}
			big[i]=bg;
		}
		return big;
	}

	public static void main(String[] args) {
		int[][] mat = MatMain.readMat();
		int[] rBig = rowWiseBig(mat);
		for(int i=0;i<rBig.length;i++)
		{
			System.out.println(i+1+" Row Biggest element: "+rBig[i]);
		}

	}

}
