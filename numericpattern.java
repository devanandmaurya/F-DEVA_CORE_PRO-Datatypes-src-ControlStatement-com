package STAR_PATERN.COM;

public class numericpattern {
	public static void main(String[] args) {

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				//System.out.print(i);
				//System.out.print(j);
			}
			System.out.println();
		}
	}
}
