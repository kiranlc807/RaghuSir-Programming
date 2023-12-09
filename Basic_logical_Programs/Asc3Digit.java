import java.util.Scanner;

class Asc3Digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 3 value");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int small = (a<b&&a<c) ? a:(b<c) ? b : c;
		int big = (a>b&&a>c) ? a:(b>c) ? b : c;
		int mid = (a+b+c)-(small+big);
		System.out.println(small+" "+mid+" "+big);
	}

}
