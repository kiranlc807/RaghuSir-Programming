import java.util.Scanner;
class Sum3Digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three digits");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a+b+c;
		System.out.println("Sum of digit:"+sum);

	}

}
