package OPPS.CONCEPTS;

public class Byusingmethodobjectinitl {

//object initialization by refrence variablesS

	String color;
	int age;

	void intObj(String st, int a) {
		color = st;
		age = a;
	}

	void dis() {
		System.out.println(color + " " + age);
	}

	public static void main(String[] args) {
		Byusingmethodobjectinitl bb = new Byusingmethodobjectinitl();
		bb.intObj("black", 19);
		bb.dis();
		System.out.println(bb.age + " " + bb.color);
	}
}