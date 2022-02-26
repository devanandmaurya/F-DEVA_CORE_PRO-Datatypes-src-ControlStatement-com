
package ControlStatement.com;

public class Leapyear {
	public static void main(String[] args) {

		int y = 201600;

		if (y % 4 == 0) {

			if (y % 100 == 0) {

				if (y % 400 == 0) {

					System.out.println("l p hai");
				}
			} else {
				System.out.println("  lp    hai   ");
			}
		} else {
			System.out.println("not lp");
		}
	}
}