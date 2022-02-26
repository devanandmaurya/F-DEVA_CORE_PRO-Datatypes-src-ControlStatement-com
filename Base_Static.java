package Inheritence.commm;


public class Base_Static {
	static int x = 10;
	static {
		m();
		System.out.println("First Static Base");
	}

	public static void main(String[] args) {

		m();
		System.out.println("main method");
	}

	public static void m() {
		System.out.println(y);
	}

	static {
		System.out.println("Second Static Base");
	}
	static int y = 20;
}
