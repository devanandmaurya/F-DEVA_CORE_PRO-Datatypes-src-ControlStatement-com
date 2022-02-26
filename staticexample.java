package INITALIZERS;

public class staticexample {

	// IN CASE OF NON STATIC VARIBLE OUTPUT GET THREE TIMES 1 1 1 ,
	// here x get three times memory in each object so no increment
	// that is each and every time constructor called and the value of x will be 1
	// always
	int x;

	static int y; // in static case object data me memory melega nhi aur class areaa me one time
					// memory milega vahi memory
	// SHARE KAREGA AUR 1 SE 2 AUR 2 SE 3 HOGA Y KE VALUES and memory size is
	// reduced

	public staticexample() {
		x++;
		y++;
		System.out.println("non static values of x ::" + x);
		System.out.println("static values y ::" + y);

	}

	public static void main(String[] args) {

		staticexample st = new staticexample();
		System.out.println(st.getClass());
		new staticexample();
		new staticexample();
		// System.out.println("static values ::" +x); // non static can not call in
		// static area
		System.out.println("in side main method static values y ::" + y); // this can call because static value
		// have in y but out put is one time only 3

	}
}
