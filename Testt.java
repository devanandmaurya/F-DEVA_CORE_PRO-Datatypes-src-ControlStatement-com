package Inheritence.commm;

public class Testt {

	public static void main(String[] args) {
		p s = new p();
		s.a();
		cd d = new cd();
		d.a();
		p as = new cd();
		as.a();
		// c asd=new p();
	}
}

class p  {
	
	//class p extends Testt {   //	CHECK BY THIS ALSO OUTPUT WILL CHANGE
	public static void a() {
		System.out.println("parrent method here print ,,,,,,,,");

	}
}

class cd extends p {
	public static void a() {

		System.out.println("child method");

	}
}