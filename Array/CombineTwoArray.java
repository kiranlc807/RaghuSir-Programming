package Array;

public class CombineTwoArray {

	public static void main(String[] args) {
		ArrayOperations ao =new ArrayOperations();
		int[] ar = ao.readArray();
		int[] ar2 = ao.readArray();
		//int[] mg = ao.merge(ar, ar2);
	
			
			int[] z=new int[ar.length+ar2.length];
			for(int i=0;i<ar.length;i++) {
				z[i]=ar[i];
			}
			
			for(int i=0;i<ar2.length;i++) {
				z[i+ar.length]=ar2[i];
			}
			System.out.println("Merged Array is");
			
			for(int i:z) {
				System.out.println(i+" ");
			}
			
	}

}
