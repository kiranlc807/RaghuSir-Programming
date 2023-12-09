package Array_2D;

public class Left90degree {
	
	static int[][] left90Degree(int[][] mat)
	{
		int[][] res = transpose(mat);
		int[][] mat1=coulmnWiseRev(res);
		
		return mat1;
		
	}

	static int[][] transpose(int[][] mat) {
		
		for(int i=0;i<mat.length;i++)
		{
			for(int j=i+1;j<mat[i].length;j++)
			{
				int temp = mat[i][j];
				mat[i][j]=mat[j][i];
				mat[j][i]=temp;
			}
		}
		return mat;
		
	}
	
	static int[][] coulmnWiseRev(int[][] mat)
	{
		for(int i=0;i<mat[0].length;i++)
		{
			int f = 0;
			int l = mat[0].length-1;
			while(f<l)
			{
				int temp = mat[f][i];
				mat[f][i]= mat[l][i];
				mat[l][i]=temp;
				f++;
				l--;

			}
		}
		return mat;
	}

	public static void main(String[] args) {
		int[][] mat = MatMain.readMat();
		System.out.println("User Enterd Array is");
		MatMain.dispMat(mat);
		System.out.println("After 90 Degree Left");
		int[][] res = left90Degree(mat);
		MatMain.dispMat(res);
		 

	}

}
