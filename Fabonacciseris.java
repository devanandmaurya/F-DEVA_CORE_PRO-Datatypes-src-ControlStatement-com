package ControlStatement.com;
//series is previeous two num is sum  0123456= 1,3,5,9,14, 19
public class Fabonacciseris {
public static void main(String[] args) {
	
	int a=0; 
	int b=1;
	int c;
	System.out.println(a);
	System.out.println(b);
	for (int i=1; i<=9;i++)
	{
		c=a+b;
		System.out.println("" + c);
		a=b; 
		b=c;
		
	}
}
}
