package Array_2D;

public class PrimeCount {
	
	static int primeCount(int[][] mat)
	{
		int count=0;
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				if(mat[i][j]!=1)
				{
				boolean rs = true;
				for(int k=2;k<=(mat[i][j]/2);k++)
				{
					if(mat[i][j]%k==0) {
					rs = false;
					break;
					}
				}
				if(rs==true)
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[][] mat = MatMain.readMat();
		int count = primeCount(mat);
		System.out.println("Prime count is:"+count);

	}

}
