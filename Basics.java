package polymorphism.com;

public class Basics {

static	void show() {
		String name = "deva", 
		cmpname = "mgs",
		mob = "8097821750";
		int age = 31;

		System.out.println(name);
		System.out.println(cmpname);
		System.out.println(mob);
		System.out.println(age);

	}

	public static void main(String[] args) {
		  System.out.println("test here ");
          System.out.println(new Basics().hashCode());  /// this is constructor 
	//	Basics b = new Basics();

	//
		//b.show();
		Basics.show(); // by class we call static members data 
	}
}
