package Array;

public class RMDuplication {

	public static void main(String[] args) {
		int[] ar= {23,56,78,56,32,78,56};
		int count=0;
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length;j++) {
				if(ar[i]==ar[j])
				{
					count++;
				}
				if(ar[i]!=ar[j])
					System.out.println(ar[i]+"---"+count);
			}
			count=0;
					
		}

	}

}
