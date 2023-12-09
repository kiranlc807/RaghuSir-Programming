package Condition;
import java.util.Scanner;

class AverageDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		double sum=0;
		int count=0;
		do {
			count++;
			int r=n%10;
			sum=sum+r;
			n=n/10;
		}while(n>0);
		System.out.println("Average of Digit is: "+sum/count);
	}

}
