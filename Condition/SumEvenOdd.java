package Condition;
import java.util.*;

class SumEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();
		int evenSum = 0;
		int oddSum = 0;
		for(int i=1;i<=n;i++) {
			if(i%2==0)
				evenSum = evenSum+i;
			else
				oddSum = oddSum+i;			
		}
		System.out.println("EvenSum: "+evenSum+"  "+"OddSum: "+oddSum);

	}

}
