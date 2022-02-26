package ControlStatement.com;

public class Swichcase {
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c;
		String st="+";
		switch(st)
		{
		case "+": c=a+b;
		System.out.println(c);
		break;
		
		
		case"-":c=a-b;
		System.out.println(c);
		break;
		case "*":c=a*b;
		System.out.println("c");
	break;
default:
	System.out.println(" IN VALID ENTER");
		}

}
}