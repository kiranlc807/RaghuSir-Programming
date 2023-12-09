package Condition;
import java.util.Scanner;

class Diveser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();
		for(int i=1;i<=n/2;i++) {
			if(n%i == 0)
				System.out.println(i);
		}
		System.out.println(n);

	}

}
