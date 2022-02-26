package STAR_PATERN.COM;

public class Star7 {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int j =4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k =2; k <= (i*2); k++) {
				System.out.print("*");

			}
/* 
			for (int l = 2; l <= i; l++) {
				System.out.print("*");
			}
			System.out.println();*/
			System.out.println();
		}
	}
}