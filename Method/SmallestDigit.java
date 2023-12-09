package Method;
import java.util.*;

class SmallestDigit {
	
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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int rs = smallest(n);
		System.out.println(rs+" is Smallest Digit");

	}

}
