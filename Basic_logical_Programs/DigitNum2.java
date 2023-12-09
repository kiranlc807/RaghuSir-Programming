import java.util.Scanner;

class DigitNum2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		if (a>9 && a<100)
			System.out.println("Number");
		else 
			System.out.println("not Number");

	}

}
