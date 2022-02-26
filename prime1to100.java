package ControlStatement.com;

public class prime1to100 {
	public static void main(String[] args) {
		int temp = 0;

		int num = 100;
		for (int i = 1; i <= 100; i++) {
			for (int j = 2; j <= i - 1; j++) {
				if (i % j == 0) {
					temp = temp + 1;
				}
			}
			 //System.out.println();
			if (temp == 0) {
				System.out.println(" The prime no is >:"+i);
				//System.out.println(i);

			} else {
				temp = 0;
			}
		}
	}

}
