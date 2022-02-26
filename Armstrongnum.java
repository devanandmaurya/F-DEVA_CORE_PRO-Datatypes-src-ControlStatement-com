package ControlStatement.com;
//if number count and its power equal is same num called armstron  no ,,0,1, 153, 370, 371, 407

//1^^1=1;^
//153=1^^3+5^^^3+3^^^3=153 is arms no 

public class Armstrongnum {

	public static void main(String[] args) {
		int num = 1653;
		///int num=123;
		int t1 = num;
		int len = 0;

		while (t1 != 0) { 
			len = len + 1;
			t1 = t1 / 10;

		}
		int t2 = 0;
		int arms = 0;
		int rem = 0;
		while (t2 != 0) {
			int mul = t2 % 10;
			for (int i = 1; i <= len; i++) {
				mul = mul * rem;

			
		}
			arms = arms + mul;
			t2 = t2 / 10;
		}
		if (arms == 0) {
			System.out.println(num + " num  is arms strong");

		}
		else {
			System.out.println(num + " num is not arms");
		}
	}

}
