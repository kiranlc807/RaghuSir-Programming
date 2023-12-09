package Array;

public class ZigZag {
	
	static int[] zigZag(int[] ar1,int[] ar2) {
		int[] z=new int[ar1.length+ar2.length];
		int i=0;
		int k=0;
		while(i<ar1.length && i<ar2.length) {
			z[k]=ar1[i];
			k++;
			z[k]=ar2[i];
			i++;
			k++;
		}
		
		while(i<ar1.length) {
			z[k]=ar1[i];
			k++;
			i++;
		}
		
		while(i<ar2.length) {
			z[k]=ar2[i];
			k++;
			i++;
		}
		
		return z;
	}

	public static void main(String[] args) {
		ArrayOperations ao =new ArrayOperations();
		int[] ar1=ao.readArray();
		int[] ar2=ao.readArray();
		System.out.println("ZigZag Array is");
		int[] arr = zigZag(ar1,ar2);
		for(int i:arr) {
			System.out.print(i+",");
		}
		

	}

}
