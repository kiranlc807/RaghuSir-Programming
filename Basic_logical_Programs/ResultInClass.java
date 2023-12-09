import java.util.Scanner;

class ResultInClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 4 sub marks");
		int p = sc.nextInt();
		int c = sc.nextInt();
		int m = sc.nextInt();
		int b = sc.nextInt();
		if(p<35 || c<35 || m<35 ||b<35)
			System.out.println("Fail");
		else {
			double per = (p+c+m+b)/4;
			if(per>=85)
				System.out.println("Distiction");
			else if(per>=60)
				System.out.println("First Class");
			else if(per>=50)
				System.out.println("Second Class");
			else
				System.out.println("Pass");
		}
	}

}
