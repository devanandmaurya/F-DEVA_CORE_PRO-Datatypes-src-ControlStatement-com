package ControlStatement.com;

import java.util.Scanner;

public class REVERSASTRING {
public static void main(String[] args) {
	Scanner sc= new Scanner(System .in);
	System.out.println("enter your string for rev ");
	String name=sc.next();
//	String name="devanand";
	String rev="";
	System.out.println("the original string length"+name.length());
	System.out.println("original string is "+name);
	
	int len=name.length();
	for(int i =len-1; i>=0;i--)
	{
		rev=rev+name.charAt(i);
		
		
	}
System.out.println("The reves string is:"+rev);	
}
}
