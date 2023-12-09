package Array;
import java.util.Scanner;

public class PairSum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayOperations ao = new ArrayOperations();
		int[] ar = ao.readArray();
		System.out.println("Enter the Sum value");
		int n = sc.nextInt();
		PrintPair2(ar,n);
		PrintPair3(ar,n);
	}

	static void PrintPair3(int[] ar, int n) {
		for(int i=0;i<ar.length-2;i++)
		{
			for(int j=i+1;j<ar.length-1;j++)
			{
				for(int k=j+1;k<ar.length;k++)
				{
					if(ar[i]+ar[j]+ar[k]==n)
						System.out.println(ar[i]+","+ar[j]+","+ar[k]);
				}
			}
		}
		
	}

	static void PrintPair2(int[] ar, int n) {
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				if(ar[i]+ar[j]==n)
					System.out.println(ar[i]+","+ar[j]);
			}
		}
		
	}

}
