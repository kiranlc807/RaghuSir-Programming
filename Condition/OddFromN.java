package Condition;
import java.util.*;

class OddFromN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		for(int i=n;i>=1;i--) {
			if(i%2!=0)
				System.out.println(i);
		}

	}

}
