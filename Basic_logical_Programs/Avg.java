import java.util.Scanner;
class Avg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double avg = (a+b+c)/3;
		System.out.println("Average is:"+avg);

	}

}
