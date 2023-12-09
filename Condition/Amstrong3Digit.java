package Condition;
import java.util.*;


class Amstrong3Digit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		do {
			int r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}while(n>0);
		if(sum==temp)
			System.out.println(temp+" is Amstrong Number");
		else
			System.out.println(temp+" is Not a Amstrong Number");

	}

}
