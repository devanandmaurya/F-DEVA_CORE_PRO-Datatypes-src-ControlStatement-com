package ControlStatement.com;

import java.util.Scanner;

public class CheckPolindromnum {
	// if we revers any num then it comes as same that is 121, 111, 515,
//just check
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");

		int num = sc.nextInt();
		int temp = num;
		int rev = 0;
		while (temp != 0) {
			int rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;

		}
		if (num == rev) {
			System.out.println(num + " is polindrom");
		} else {
			System.out.println(num + "not polindrom num");
		}
	}
}
