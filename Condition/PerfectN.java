package Condition;
import java.util.*;


class PerfectN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			for(int j =1;j<i;j++) {
				if(i%j==0)
					sum=sum+j;
			}
			if(sum==i)
				System.out.println(i);
				
			sum=0;	
				
		}

	}

}
