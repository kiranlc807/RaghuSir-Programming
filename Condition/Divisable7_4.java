package Condition;
import java.util.*;

class Divisable7_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%7==0&&i%4==0)
				System.out.println(i);
		}

	}

}
