package INITALIZERS;

public class Employee {

	String name;
	int age;
	int id;
	salary sal; // noe thi become global variable
	Address add; // noe thi become global variable

	
	//these are non static initializers
	public Employee(String n, int a, int i) {

		name = n;
		age = a;
		id = i;
	}

	{// here add is local variable it can do as use only reference
		// Address add = new Address();
		add = new Address();

		// System.out.println("Address are : " + add.city + " " + add.state + " " +
		// add.pincode);

	}
	{
		sal = new salary();

		// System.out.println("emp salry info >> " + sal.ta + " " + sal.hra + " " +
		// sal.da);
	}

	void showinfo() {

		System.out.println("Address are : " + add.city + " " + add.state + " " + add.pincode);
		System.out.println("emp salry info >> " + sal.ta + " " + sal.hra + " " + sal.da);
		System.out.println("employee info are ::" + name + " " + age + " " + id);

	}

	public static void main(String[] args) {

		Employee e = new Employee("deva", 12, 111);
		e.showinfo();
		// System.out.println("employee info are ::" + e.name + " " + e.age + " " +
		// e.id);
	}

}
