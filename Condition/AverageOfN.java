package Condition;
import java.util.*;

class AverageOfN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		double sum=0;
		double avg;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		avg=sum/n;
		System.out.println("Average of number is: "+avg);

	}

}
