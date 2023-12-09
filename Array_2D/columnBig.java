package Array_2D;

public class columnBig {
	
	static int[] columnWiseBig(int[][] mat)
	{
		int[] big = new int[mat[0].length];
		for(int i=0;i<mat[0].length;i++)
		{
			int bg=mat[0][i];
			for(int j=1;j<mat.length;j++)
			{
				if(mat[j][i]>bg)
					bg=mat[j][i];
			}
			big[i]=bg;
		}
		return big;
	}

	public static void main(String[] args) {
		int[][] mat = MatMain.readMat();
		int[] cbig = columnWiseBig(mat);
		for(int i=0;i<cbig.length;i++)
		{
			System.out.println(i+1+" Column biggest element: "+cbig[i]);
		}
	}

}
