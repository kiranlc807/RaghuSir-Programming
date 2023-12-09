import java.util.Scanner;

class Mid3Digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 Digits");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a>b&&a<c || a<b&&a>c)
			System.out.println(a+" is middle");
		else if (b>a&&b<c || b<a&&b>c)
			System.out.println(b+" is middle");
		else 
			System.out.println(c+" is middle");

	}

}
