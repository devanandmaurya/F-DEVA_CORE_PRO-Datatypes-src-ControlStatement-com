package Inheritence.commm;

class Animal {

}

class Cow extends Animal {

}

public class Overloadingexa {
	public void m1(Animal A) {
		System.out.println("animal version");

	}

	public void m1(Cow C) {
		System.out.println("Cow version");
	}

	public static void main(String[] args) {

		Overloadingexa v = new Overloadingexa();
		Animal a = new Animal();
		v.m1(a);
		Cow c = new Cow();
		v.m1(c);
		Animal aa = new Animal();
		v.m1(aa);
	}
}
//IN OVERLOADING METHOD RESULATION ALWAYS TAKE CARE BY COMPILER AND
//ON REERANCE TYPE AND RUNTIME OBJECT NEVER PLAY ANY ROLE IN OVERLOADING