package Array_2D;

public class EvenOddCount {
	
	static int[] EOcount(int[][] mat)
	{
		int[] count = new int[2];
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				count[mat[i][j]%2]++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[][] mat = MatMain.readMat();
		int[] count = EOcount(mat);
		System.out.println("Even Count is: "+count[0]+"\n"+" Odd Count is: "+count[1]) ;

	}

}
