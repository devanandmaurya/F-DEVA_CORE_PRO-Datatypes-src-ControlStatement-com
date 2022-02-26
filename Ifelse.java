package ControlStatement.com;

public class Ifelse {

	public static void main(String[] args) {
		
		int a, b, c;
		a=15432465;
		b=343244;
		c=67568;
		
		/*if(a>b) {
			System.out.println("a is big");
			
		}
		else 
		{
			System.out.println("b is big");
		}
		*/if(a>b & a>c)
		{
			System.out.println("a is greater");
			
			
		}
		else if(b>c & b>a)
		{
			System.out.println("b is big");
		}
		else 
		{
			System.out.println("c is big");
		}
	}
	
	
}
