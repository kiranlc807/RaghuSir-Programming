package Recursion;
import java.util.*;

public class nTo1Num {
	
	static void display(int n)
	{
		if(n==0)
			return;
		System.out.print(n+" ");
		display(n-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		display(n);
	}

}
