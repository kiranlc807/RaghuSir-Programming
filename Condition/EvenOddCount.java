package Condition;
import java.util.Scanner;


class EvenOddCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n= sc.nextInt();
		int esum=0;
		int osum=0;
		do {
			int r=n%10;
			if(r%2==0)
				esum++;
			else
				osum++;
			n=n/10;
		}while(n>0);
		System.out.println("Count of Even Digit: "+esum+"\n"+"Count of Odd Digit: "+osum);

	}

}
