package ControlStatement.com;

public class Facusingrecursion {

	static int a = 0, b = 1, c;

	public static void main(String[] args) {
		System.out.print(a + " " + b);
		Facusingrecursion f = new Facusingrecursion();
		f.fin(4);
	}

	void fin(int i) {
		if (i >= 1) {
			c = a + b;
			System.out.print(" "+c);
			a = b;
			b = c;
			fin(i - 1);

		}
	}
}
