import java.util.Scanner;

class DaysInMon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month");
		int m = sc.nextInt();
		if (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)
			System.out.println("31 Days");
		else if (m==4 || m==6 || m==9 || m== 11)
			System.out.println("30 Days");
		else
			System.out.println("invalid month number");

	}

}
