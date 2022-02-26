package ControlStatement.com;

import java.util.Scanner;

public class Tablesc {

	public static void main(String[] args) {
		//int t=9;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for table");
		int p= sc.nextInt();
		for (int i=1; i<=10; i++)
		{
			int table=i*p;
			
			//System.out.println(table);
			System.out.println("p"+ "*"+"i=:"+table);
		}
	}
}
