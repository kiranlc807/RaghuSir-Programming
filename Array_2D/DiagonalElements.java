package Array_2D;

public class DiagonalElements {
	
	static int[][] diagonalRev(int[][] mat)
	{
		int f=0;
		int l=mat.length-1;
		while(f<l)
		{
			int temp = mat[l][l];
			mat[l][l]=mat[f][f];
			mat[f][f]=temp;
			f++;
			l--;
		}
		return mat;
	}

	public static void main(String[] args) {
		int[][] mat = MatMain.readMat();
		int[][] Dmat = diagonalRev(mat);
		System.out.println("User Enterd Matrix");
		MatMain.dispMat(mat);
		System.out.println("After Diagonal Reverse");
		MatMain.dispMat(Dmat);

	}

}
