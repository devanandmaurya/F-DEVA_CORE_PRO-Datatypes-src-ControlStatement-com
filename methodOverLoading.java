package OPPS.CONCEPTS;

public class methodOverLoading {
	void area(int l, int b) {
		System.out.println("The area of squar is " + (l * b));
	}

	void area(int l, int b, int h) {
		System.out.println("area of rectangle is " + (l * b * h));
	
	System.out.println("This is the final output of the rect...");
	}
	

	void sum(int a, int b) {
		System.out.println("sum of a and b is " + (a + b));

	}

	void sum(float a, float b) {
		System.out.println("sum of float is " + (a + b));
	}

	public static void main(String[] args) {
		methodOverLoading cl = new methodOverLoading();
		cl.sum(10, 21);
		cl.sum(21.2f, 21.4f);
		cl.area(2, 4);
		cl.area(3, 4, 5);
	}
}
