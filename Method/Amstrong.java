package Method;
import java.util.Scanner;


class Amstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		boolean rs = amstrongCheck(n);
		if(rs==true)
			System.out.println(n+" is Amstrong Number");
		else
			System.out.println(n+" is Not Amstrong Number");

	}
	
	static boolean amstrongCheck(int n) {
		int sum = 0;
		int temp = n;
		do {
			int r = n%10;
			sum = sum+r*r*r;
			n=n/10;
		}while(n!=0);
		if(sum==temp)
			return true;
		else
			return false;
	}

}
