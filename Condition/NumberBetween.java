package Condition;
import java.util.*;


class NumberBetween {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting Number");
		int m = sc.nextInt();
		System.out.println("Enter the Ending Number");
		int n = sc.nextInt();
		for(int i=m;i<n-1;i++) {
			System.out.println(i+1);
		}

	}

}
