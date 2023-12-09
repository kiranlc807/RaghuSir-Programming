package Array_2D;

public class Paliendrom {
	
	static boolean isPaliendrom(int n)
	{
		int temp=n;
		int rev =0;
		do {
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}while(n!=0);
		
		return temp==rev;
	}

	public static void main(String[] args) {
		int[][] mat = MatMain.readMat();
		int count =0;
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				boolean rs = isPaliendrom(mat[i][j]);
				if(rs==true)
					count++;
			}
		}
		System.out.println("Paliendrom count is: "+count);
	}

}
