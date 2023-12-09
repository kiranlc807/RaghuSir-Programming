package Array;

public class Leader {

	public static void main(String[] args) {
		ArrayOperations ao = new ArrayOperations();
		int[] ar = ao.readArray();
		
		for(int i = 0;i<ar.length;i++)
		{
			boolean rs=false;
			for(int j = i+1;j<ar.length;j++)
			{
				if(ar[j] > ar[i])
				{
					rs=true;
					break;
				}
			}
			if(rs==false)
			System.out.print(ar[i]+" , ");
		}

	}

}
