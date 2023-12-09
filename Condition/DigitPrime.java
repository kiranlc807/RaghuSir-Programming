package Condition;
import java.util.Scanner;

class DigitPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int count=0;
		int count2=0;
		do{
			int r = n%10;
			for(int i=1;i<=r;i++) {
				if(r%i==0)
					count++;
			}
			if(count==2)
				count2++;
			count=0;
			
			n=n/10;
		}while(n>0);
		System.out.println(count2+" Digits are Prime");

	}

}
