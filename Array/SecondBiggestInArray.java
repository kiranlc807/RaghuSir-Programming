package Array;

public class SecondBiggestInArray {

	public static void main(String[] args) {
		ArrayOperations ao = new ArrayOperations();
		int[] ar = ao.readArray();
//		int fbig=Integer.MIN_VALUE,sbig=Integer.MIN_VALUE;
//		for(int i=0;i<ar.length;i++) {
//			if(ar[i]>fbig)
//			{
//				sbig=fbig;
//				fbig=ar[i];
//			}
//			else if(ar[i]>sbig&&ar[i]!=fbig){
//				sbig=ar[i];
//			}
//		}
//		System.out.println(sbig);
		int sbig = ao.secongBiggestElement(ar);
		System.out.println(sbig+" is second biggest element");
	}

}
