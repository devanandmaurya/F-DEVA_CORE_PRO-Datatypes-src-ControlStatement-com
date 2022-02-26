package STAR_PATERN.COM;

public class numeric02 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <= i; j++) {
				count = count + 1;
				System.out.print(  count  );
			
				// System.out.print("*");
				// System.out.print(i);
				// System.out.print(j);
			}
			System.out.println();
		}
	}
}
