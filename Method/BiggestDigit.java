package Method;
import java.util.*;

class BiggestDigit {
	
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
		System.out.println("Biggest Number is : "+big);
	}

}
