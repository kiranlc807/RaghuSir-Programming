package Array;

class Solution {

	public static void main(String[] args) {
		ArrayOperations ao = new ArrayOperations();
		int[] ar = ao.readArray();
		int big = ao.biggest(ar);
		int small = ao.smallest(ar);
		int[] ct = ao.countEO(ar);
		System.out.println("Biggest is:"+big);
		System.out.println("Smallest is:"+small);
		System.out.println("Even Count is:"+ct[0]);
		System.out.println("Odd Count is:"+ct[1]);

	}

}
