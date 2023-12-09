import java.util.Scanner;

class Smallest3Digit {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Three Values");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int small = a;
	if(b<small)
		small = b;
	if(c<small)
		small=c;
	System.out.println(small+" Is Smallest Num");
	

	}

}
