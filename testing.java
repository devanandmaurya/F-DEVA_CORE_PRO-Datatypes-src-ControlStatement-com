package Inheritence.commm;

public class testing {

	public static void main(String[] args) {
		pp s = new pp();
		s.a();
		dp d = new dp();
		d.a();
		pp as = new dp();
		as.a();

	}
}

class pp extends testing

{
	public void a() {
		System.out.println("parrent method");

	}
}

class dp extends pp {
	public void a() {
		System.out.println("child method");
	}
}
