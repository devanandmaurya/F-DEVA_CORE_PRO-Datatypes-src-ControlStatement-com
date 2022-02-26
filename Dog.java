package Inheritence.commm;

class Test {   //parent or supper class

	void eat() {
		System.out.println("i am eating ");
	}
}

// inheritance is a mechanism in which child class inherit property of parrent
// class.
// it is achieved by EXTENDS KEYWORDS
//it advantage is code reusbility 
//we can achieved polymoriphism that  method overriding 
// disadvantage is tight coupling  one class change to effect another class.
//type off inheritance 
// single class inheritance
// herrirical inherrrrrr
// multilevel inheritance
// multiple inh
// hybrid inheritance  
// java support only  ..>>>>>>>>>SINGLR  , MULTILEVEL, HERARICAL ,  THREE SUPPORT 

 class Dog extends Test {  // child , sub class ..>> dog 
	 public static void main(String[] args) {
	 
	 //DOF IS-A RELATIONSHIP
	 //CHILD CLASS IS DOG 
	 //BASIC FIRST IS A PARRENT CLASS
 

//	void bark()
	//{
		//System.out.println("dog is barking ");
	
		Dog d= new Dog();
	//	d.bark();
		d.eat();
	}
 }