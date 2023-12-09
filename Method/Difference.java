package Method;
import java.util.*;

class Difference {
	
	static int smallest(int n) {
		int small = 9;
		do {
			int r=n%10;
			if(r<small)
				small=r;
			n=n/10;
		}while(n!=0);
		return small;
	}
	
	static int biggest(int n) {
		int big = -9;
		do {
			int r = n%10;
			if(r>big)
				big=r;
			n=n/10;
		}while(n!=0);
		
		return big;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int big = biggest(n);
		int small = smallest(n);
		System.out.println("Difference b/w Biggest Digit and Smallest Digit: "+(big-small));
		

	}

}
