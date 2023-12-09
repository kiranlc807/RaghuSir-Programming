import java.util.Scanner;
class ArthmaticOP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Number");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double sum = a+b;
		double sub = a-b;
		double mult = a*b;
		double div = a/b;
		System.out.println("sum:"+sum+"\n"+"sub:"+sub+"\n"+"mult:"+mult+"\n"+"div:"+div);
	}

}
