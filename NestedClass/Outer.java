package NestedClass;

public class Outer{
	static int a=10;
	
	static class Inner{
		
		void m1() {
			System.out.println(a);
		}
		
		
	}
	public static void main(String[] args) {
//		Outer o = new Outer();
		Outer.Inner i = new Outer.Inner();
		i.m1();
	
	}

}

