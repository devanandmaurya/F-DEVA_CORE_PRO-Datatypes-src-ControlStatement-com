package OPPS.CONCEPTS;

public class secod_oppss {
	public void eat() {
		System.out.println("i  am eating");
	}
public static void main(String[] args) {
	System.out.println("i am runing ");
	OPPSfirst_pro b= new OPPSfirst_pro();
	Birds bb=new Birds();
	
	b.eat();
	b.sleeps();
	bb.fly();
}
//ANY METHODS CALL BY THAT CLASS OBJECT NOT OTHER CLASS OBJECTS 
//BIRDS CLASS METHOD CANT FIND SYMBLE SHOW IN SECOND _ OPPSS CLASS BUT AFTER CREATE OBJECT
// OF BIRDS CLASS WE CAN DO IT AND BY INHERITANCEEEEEEEEEEEE WE CAN  CALL DIRECTLLY 
public void sleeps()
{
System.out.println("i am sleeping right ");
}

} 
class Birds 
{
	void fly()
	{
		System.out.println("birds flying ");
	}
}