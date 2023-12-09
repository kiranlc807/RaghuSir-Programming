package Array;

public class SortArray {

	public static void main(String[] args) {
		ArrayOperations ao= new ArrayOperations();
		int[] ar1= ao.readArray();
		int[] ar2= ao.readArray();
		int[] sortedAr = ao.sortArray(ar1,ar2);
		System.out.println("sorted array is");
		for(int i=0;i<sortedAr.length;i++) {
			System.out.println(sortedAr[i]);
		}

	}
	/*static int[] sortedArray(int[] x, int[] y) {
		int[] z=new int[x.length+y.length];
		int i=0,j=0,k=0;
		while(i<x.length&&j<y.length) {
			if(x[i]<y[j])
			{
				z[k]=x[i];
				i++;
			}
			else
			{
				z[k]=y[j];
				j++;
			}
			k++;
		}
		while(i<x.length) {
			z[k]=x[i];
			i++;
			k++;
		}
		while(j<y.length) {
			z[k]=y[j];
			j++;
			k++;
		}
		
		return z;
		
		
	}*/

}
