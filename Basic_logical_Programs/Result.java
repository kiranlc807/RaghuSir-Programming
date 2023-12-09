import java.util.Scanner;
class Result {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 4 sub marks");
		int p = sc.nextInt();
		int c = sc.nextInt();
		int m = sc.nextInt();
		int b = sc.nextInt();
		if (p>=35 && c>=35 && b>=35 && m>=35)
			System.out.println("Pass");
		else
			System.out.println("Fail");

	}

}
