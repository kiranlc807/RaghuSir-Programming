import java.util.Scanner;

class Swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap\n"+"a = "+a+" b = "+b);

	}

}
