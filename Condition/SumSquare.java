package Condition;
import java.util.Scanner;


class SumSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int sum = 0;
		do {
			int r=n%10;
			sum=sum+r*r;
			n=n/10;
		}while(n>0);
		System.out.println("Sum of Square of Digit: "+sum);

	}

}
