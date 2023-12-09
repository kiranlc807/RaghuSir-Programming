package Array_2D;

public class CoulmnReverse {
	
	static int[][] columnWiseReverse(int[][] mat)
	{
		for(int i=0;i<mat[0].length;i++)
		{
			int f=0,l=mat.length-1;
			while(f<l)
			{
				int temp = mat[l][i];
				mat[l][i]=mat[f][i];
				mat[f][i]=temp;
				f++;
				l--;
			}
		}
		return mat;
	}

	public static void main(String[] args) {
		int[][] mat = MatMain.readMat();
		int[][] columnRev = columnWiseReverse(mat);
		System.out.println("After Column Wise Revered");
		MatMain.dispMat(columnRev);

	}

}
