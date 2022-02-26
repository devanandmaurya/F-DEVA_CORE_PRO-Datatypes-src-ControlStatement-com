package ControlStatement.com;

import java.util.Scanner;

public class Factorialno {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number ");
	int f=sc.nextInt();
	//int f=5;
	int fact=1;
	//for(int i=1;i<=f;i++)
		for(int j=f;j>1; j--)
	{
		//fact=fact*i;
			fact =fact*j;
		
	}
System.out.println(fact);}
}
