package ControlStatement.com;

import java.util.Scanner;

public class ScannerCALCULATOR {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
System.out.println("Enter f num");
int a=sc.nextInt();
System.out.println("Enter sec no.");
		int b=sc.nextInt();
		System.out.println("select symbol (+,-,* ,/)");
		String st1=sc.next();
		
		int c;
		switch(st1)
		{
		case "+": c=a+b;
		System.out.println(c);
		break;
		
		
		case"-":c=a-b;
		System.out.println(c);
		break;
		case "*":c=a*b;
		System.out.println(c);
	break;
		case"/":c=a/b;
		System.out.println(c);
		break;
		
default:
	System.out.println(" IN VALID ENTER");
		}

}
}
