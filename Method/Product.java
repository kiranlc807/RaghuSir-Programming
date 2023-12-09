package Method;
import java.util.*;


class Product {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int P = productDigit(n);
		System.out.println("Product of Digit is: "+P);
	}
	
	static int productDigit(int n) {
		int pro=1;
		do {
			int r = n%10;
			pro = pro*r;
			n=n/10;
		}while(n!=0);
		
		return pro;
	}

}
