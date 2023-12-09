import java.util.Scanner;
class Ractangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length and Bredth");
		double l = sc.nextDouble();
		double b = sc.nextDouble();
		double area  = l * b;
		double perimeter = 2*(l+b);
		System.out.println("Area is:"+area);
		System.out.println("Perimeter is:"+perimeter);

	}

}
