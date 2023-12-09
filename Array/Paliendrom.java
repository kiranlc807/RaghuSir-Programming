package Array;

class Paliendrom {

	public static void main(String[] args) {
		ArrayOperations ao = new ArrayOperations();
		int[] ar =ao.readArray();
		int count=0;
		for(int i=0;i<ar.length;i++) {
			boolean rs = isPaliendrom(ar[i]);
			if(rs==true)
				count++;
		}
		System.out.println("Count of Paliendrom Number in Array is:"+count);

	}
	
	static boolean isPaliendrom(int n) {
		int sum=0,temp=n;
		do {
			int r=n%10;
			sum=sum*10+r;
			n=n/10;
		}while(n!=0);
		
		return sum==temp;
	}

}
