package Array_2D;

public class RowReverse {
	
	static int[][] rowReversed(int[][] mat)
	{
		for(int i=0;i<mat.length;i++)
		{
			int f=0,l=mat[0].length-1;
			while(f<l)
			{
				int temp=mat[i][f];
				mat[i][f]=mat[i][l];
				mat[i][l]=temp;
				f++;
				l--;
			}
		}
		return mat;
	}

	public static void main(String[] args) {
		int[][] mat = MatMain.readMat();
		int[][] rowRev = rowReversed(mat);
		System.out.println("After Row Wise Reversing ");
		MatMain.dispMat(rowRev);

	}

}
