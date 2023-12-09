import java.util.Scanner;

class SanjuGeetha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int a = sc.nextInt();
		if(a%3==0 && a%5==0)
			System.out.println("SANJU WEEDS GEETHA");
		else if(a%5==0)
			System.out.println("GEETHA");
		else if (a%3==0)
			System.out.println("SANJU");
		else
			System.out.println("BREAK UP");
			

	}

}
