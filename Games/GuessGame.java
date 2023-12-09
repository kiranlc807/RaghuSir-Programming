package Games;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new  Random();
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int x = rd.nextInt(10);
		if(n==x)
			System.err.println("You won The Game");
		else
		{
			System.out.println("You Lose The Game\n num was:"+x);
		}
		

	}

}
