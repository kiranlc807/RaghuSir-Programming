package Array_2D;

public class SpiralOrder {
	
	static void printSpiralOrder(int[][] mat)
	{
		for(int i=0,j=mat.length-1;i<j;i++,j--)
		{
			for(int k=i;k<j;k++)
			{
				System.out.print(mat[i][k]+" ");
			}
			for(int k=i;k<j;k++)
			{
				System.out.print(mat[k][j]+" ");
			}
			for(int k=j;k>0;k--)
			{
				System.out.print(mat[j][k]+" ");
			}
			for(int k=j;k>0;k--)
			{
				System.out.print(mat[k][i]+" ");
			}
		}
		if(mat.length%2==1)
			System.out.println(mat[mat.length/2][mat.length/2]);
	}

	public static void main(String[] args) {
		int[][] mat = MatMain.readMat();
		System.out.println("User Enterd Matrix is");
		MatMain.dispMat(mat);
		printSpiralOrder(mat);

	}

}
