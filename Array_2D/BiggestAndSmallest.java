package Array_2D;

public class BiggestAndSmallest {

	public static void main(String[] args) {
		int[][] ar = MatMain.readMat();
		System.out.println("User Enterd Elements");
		MatMain.dispMat(ar);
		int big = MatMain.biggest(ar);
		int small= MatMain.samllest(ar);
		int sum = MatMain.matSum(ar);
		System.out.println("Smallest :"+small+"\n"+"Biggest :"+big+"\nSum of elements :"+sum);
		

	}

}
