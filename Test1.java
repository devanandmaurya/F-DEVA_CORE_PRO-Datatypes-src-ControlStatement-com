package Inheritence.commm;

class B {
	void showB() {
		System.out.println("B method");
	}
	 // THIS IS SINGLE INHERIRANCE
}

class Test1 extends B

// by child class object we can call both parent and child method.
{
	void showT() {
		System.out.println("TEST1  class method ");
	}

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.showB();
		t.showT();
		B b = new B();
	    b.showB();
	    b.showB(); //IT CAN NOT CALL BY PARENT CLASS ref ig t.show() DUE TO OUT OF SCOPE

	}
}