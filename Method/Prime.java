package Method;
import java.util.*;


class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		boolean rs = primeCheck(n);
		if(rs==true)
			System.out.println(n+" is Prime");
		else
			System.out.println(n+" is not Prime");

	}
	
	static boolean primeCheck(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				count++;
		}
			
		if(count==2)
			return true;
		else
			return false;
	}

}
