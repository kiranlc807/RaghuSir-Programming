package Array;

public class ArrayDuplicationRemove {

	public static void main(String[] args) {
		ArrayOperations ao = new ArrayOperations();
		int[] ar=ao.readArray();
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[j]<ar[i])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		
		
		int n=ao.removeDuplication(ar);
		for(int i=0;i<n;i++) {
			System.out.println(ar[i]+",");
		}
	}
	
	

}
