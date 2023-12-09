package Array;

class ReversElements {

	public static void main(String[] args) {
		ArrayOperations ao = new ArrayOperations();
		int[] ar=ao.readArray();
		int a=0,b=ar.length-1;
		while(a<=b) {
			int temp=ar[b];
			ar[b]=ar[a];
			ar[a]=temp;
			a++;
			b--;
			
		}
		for(int i:ar) {
			System.out.println(i);
		}

	}

}
