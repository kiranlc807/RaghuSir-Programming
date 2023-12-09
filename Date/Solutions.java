package Date;

import java.util.Scanner;

public class Solutions {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the first date in the form of dd/mm/yy");
		int d1 = sc.nextInt();
		int m1 = sc.nextInt();
		int y1 = sc.nextInt();
		Date dt1 = new Date(d1,m1,y1);
		System.out.println("Enter the second date in the form of dd/mm/yy");
		int d2 = sc.nextInt();
		int m2 = sc.nextInt();
		int y2 = sc.nextInt();
		Date dt2 = new Date(d2,m2,y2);
		
		int diff = dt2.noOfDays()-dt1.noOfDays();
		System.out.println("Number of Days B/W "+dt1+" and "+dt2+" is "+diff);
		
		System.out.println("Days of two date \n"+dt1.day()+"\n"+dt2.day());

	}

}
