package Array;

public class ArrayDuplictionRemove {

	public static void main(String[] args) {
		ArrayOperations ao = new ArrayOperations();
		int[] ar = ao.readArray();
		int[] y = removeDuplicate(ar);
		System.out.println("After removing duplicates");
		for(int i:y)
			System.out.println(i);
	}

	static int[] removeDuplicate(int[] x) {
		
		boolean[] rs = new boolean[x.length];
		int count=0;
		for(int i=0;i<x.length;i++)
		{
			if(rs[i]==false)
			{
				for(int j=i+1;j<x.length;j++)
				{
					if(x[i]==x[j])
					{
						count++;
						rs[j]=true;
					}
				}
			}
		}
		int[] y = new int[x.length-count];
		int k=0;
		for(int i=0;i<x.length;i++)
		{
			if(rs[i]==false)
			{
				y[k]=x[i];
				k++;
			}
		}
		
		return y;
	}

}
