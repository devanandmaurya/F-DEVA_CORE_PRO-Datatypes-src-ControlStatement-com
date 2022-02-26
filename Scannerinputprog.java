package ControlStatement.com;

import java.util.Scanner;

public class Scannerinputprog {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the  name");
	String n=sc.next();
	System.out.println("enter gender");
	char g=sc.next().charAt(0);
	System.out.println("enter mob no");
	long m=sc.nextLong();
	System.out.println("enter age");
int a=sc.nextInt();

System.out.println("name" +n + "gender " + g +"mobile " +m + "age "+ a);




}


}
