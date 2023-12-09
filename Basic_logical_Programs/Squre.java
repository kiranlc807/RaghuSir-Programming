import java.util.Scanner;
class Squre {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of squre");
		double side = sc.nextDouble();
		double area = side * side;
		double perimeter = 4 * side;
		System.out.println("Area is:"+area);
		System.out.println("Perimeter is:"+perimeter);

	}

}
