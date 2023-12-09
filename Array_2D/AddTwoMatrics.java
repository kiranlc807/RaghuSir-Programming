package Array_2D;

public class AddTwoMatrics {

	public static void main(String[] args) {
		int[][] mat1 = MatMain.readMat();
		int[][] mat2 = MatMain.readMat();
		System.out.println("User enterd 2Array is");
		MatMain.dispMat(mat1);
		System.out.println("=========");
		MatMain.dispMat(mat2);
		int[][] Add = new int[mat1.length][mat1[0].length];
		for(int i=0;i<Add.length;i++)
		{
			for(int j=0;j<Add.length;j++)
			{
				Add[i][j]=mat1[i][j]+mat2[i][j];
			}
		}
		System.out.println("After Adding Two Matrix");
		MatMain.dispMat(Add);
	}

}
