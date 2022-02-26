package INITALIZERS;

public class INITALIZERS {

	// IT IS A SPECIAL TYPE OF CONCEPT USE TO ASSIGN THE DATA BEFORE CONSTRUCTOR
	// IT TWO TYPE --1--> INIT CBLOCK >>IT IS ALSO CALLED ANNONYMOUS BLOCK WHICH ARE
	// USE TO ASSIGNE THE DATA BEFORE CONSTRUCTOR
	// IF WE WANT DEPENDENCY THEN WE SHOUD GO FOR THIS. LIKE COONCTION CODE FOR DATA
	// BASE AND WE CAN WRITE LOGIC FOR IT IT is NOT USE IN A METHOD

	// IF MORE THAN ONE INIT BLOCK THEN ITS ORDER OF EXECUTION IS FCFC (FIRST COME
	// FIRST SERVE);
	// IT WRITE AS { INIT BLOCK THAT ARE OBJECT DEPENDEDT BLOCK THAT ARE WE CAN NOT
	// EXECUTE WITHOUT OBJECT }
// note >> agar object nhi rahega class me to init block or constructor nhi chalega
	// becuse init block execute by object and constructor
	// init block me same class ke object nhi banate hai
	// this is init block first called
	{
		int x = 11;
		System.out.println("init blok ");
		System.out.println(x);
	}

	int x;

	public INITALIZERS() { // constructor invoked when object created//
		System.out.println("constructor part called x" + x);
		x = 100;
		System.out.println(x);
	}

	public static void main(String[] args) {
		INITALIZERS i = new INITALIZERS();
		// first run inint block then static block
		System.out.println("by object ref get data" + i.x);
		System.out.println("main block block");
		{
			int xyz = 111;
			System.out.println(xyz);
		}

	}

}
