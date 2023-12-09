package Array_2D;

public class TransposeMat {

	public static void main(String[] args) {
		int[][] mat= MatMain.readMat();
		MatMain.dispMat(mat);
		int[][] trans = new int[mat[0].length][mat.length];
		for(int i=0;i<trans.length;i++)
		{
			for(int j=0;j<trans[i].length;j++)
			{
				trans[i][j]=mat[j][i];
				
			}
		}
		System.out.println("After Transpose");
		MatMain.dispMat(trans);
				

	}

}
