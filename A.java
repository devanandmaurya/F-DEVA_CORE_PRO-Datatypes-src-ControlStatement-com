package Inheritence.commm;
//multilevel inheritance 
public class A {
void showA()
{
	System.out.println("a method");
}

}

class Bb extends A

{
	void showB()
	{
		System.out.println(" Bb class method ");
	}
//MULTIPLE INHERITANCE IS NOT SUPPORT BY JAVA DUE TO AMBIGUITY  PROBLEM 
	// WHICH METHOD NEED TO CALL IF BOTH HAVE SAME NAME OF METHOD
	
	//CLASS A EXTENDS B ,C ,D 
	// MAIN(0
	//C c= new c();
	//B b = New B();
	

}
class C extends Bb
{
	void showC()
	{
		System.out.println("c class method");
	}
public static void main(String[] args) {
	
	C a=new C();
	a.showA();
	//a.showC();
	
	B b= new B();
	b.showB();
C c= new C();  // by this class we call all class methods 
//indirectly 1st class ke property 3rd class me ja rhi h

c.showA();
c.showB();
c.showC();
	//a.showB();  //can not call this 
	//a.showC();  //can not call this 
}
}  
//object is the parrent class in the java all the classes 
//every class can be only one super class because java does not 
//support multiple inheritance


//+++++++++ NOTE+++
/*
//constuctor does not inherit in inheritance  
like
class s
{
	s()
	{
	}
}
class t exteds s
{
}//private mehode can not inherited  
//thats why sari property cant not inherit all class taht is constr and private method 
//here s () is constructor that does not inheritad 
*/	