import java.util.Scanner;
class BMI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Weight and Height of person");
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		double bmi = w/(h*h);
		System.out.println("BMI of Person is:"+bmi);

	}

}
