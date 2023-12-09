package Method;
import java.util.*;

class DigitSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int sum = sum(n);
		System.out.println("Sum of Digit is: "+sum);

	}
	
	static int sum(int n) {
		int sum = 0;
		do {
			int r = n%10;
			sum = sum+r;
			n=n/10;
		}while(n!=0);
		return sum;
	}

}
