package INITALIZERS;

public class staticintilizersusedpro {

	static String name, clgname;
	static String cmpname;
	int age, sal;

	staticintilizersusedpro(String n, String c, String cm, int a, int s) {
		name = n;
		clgname = c;
		cmpname = cm;
		age = a;
		sal = s;

	}
	// static String clgname kiya to CLASS AREA ME MEMRORY ALLOCATE HOJAYAGA CLASS
	// AREA IS PART OF METOD AREA

	    void viewinfo() {
		System.out.println(name + " " + clgname + " " + cmpname + " " + age + " " + sal);
	}
	// static is a keyword used for data , member function , block and nested class.
	// but not applied on class or local variable ,constructor.

	// static data member>>>-:

	   public static void main(String[] args) {

		staticintilizersusedpro s = new staticintilizersusedpro("ram", "siet", "mnt", 21, 34000);
		s.viewinfo();
		staticintilizersusedpro s1 = new staticintilizersusedpro("abhay", "uit", "mnt", 31, 3200);
		s1.viewinfo();

		staticintilizersusedpro s2 = new staticintilizersusedpro("rajan", "git", "mnt", 19, 21000);
		s2.viewinfo();

		// SATACK AREA ME S , S1, S2 ARE SHARE SAME MEMORY AREA AS IF IT USE STATIC
		// VARIBLE MEMBER .
		// NON STATIC KE CASE ME ALAG ALAG MEMORY CREATE HOTA HAI HEAP MEMEORY AREA ME
		 s.viewinfo();
		System.out.println("object are having diference memory in heap area  s:" + s.hashCode());
		System.out.println("object are having diference memory in heap area s1: " + s1.hashCode());
		System.out.println("object are having diference memory in heap area  s2:" + s2.hashCode());
	}
}
