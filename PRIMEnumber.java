package ControlStatement.com;

import java.util.Scanner;

//PRIME NUM IS THAT WHICH IS DEVIDED ONLY 1 AND SELF AS 7,17 3 IS PRIME 
//AND 12, 25 ,15 IS NOT PRIME

public class PRIMEnumber {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the num");
	int num= sc.nextInt();
	//int num=70;
	int temp=0;
	for(int i=2;i<=num-1;i++)
	{
		if(num%i==0)
		{
			temp=temp+1;
		}
	
	}
  if(temp>0)
  {
	  System.out.println("not prime");
  }
  else 
  {
	  System.out.println("num is prime");
  }
}
}
