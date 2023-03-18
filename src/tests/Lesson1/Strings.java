package tests.Lesson1;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100;
		int b = 200;
		String x = "hello";
		String y = "world";
		
		// jvm reads from left to right
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));

	}

}
