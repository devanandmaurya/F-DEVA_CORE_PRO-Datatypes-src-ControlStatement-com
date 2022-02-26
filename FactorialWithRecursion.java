package ControlStatement.com;

import java.util.Scanner;

public class FactorialWithRecursion {
	
	static int factss=1;
 public static void main(String[] args) {
	
	 Scanner sc=new Scanner (System.in);
	//int num=5; 
	
	System.out.println("enter the number for factorials which you wants ");
	
int num=sc.nextInt();
	FactorialWithRecursion nt= new FactorialWithRecursion();
	nt.factcal(num);
	System.out.println("factorial of fact is: "+factss);
}
  void factcal( int num)
  {
	if(num>=1)  
	{
		factss=factss*num;
				factcal( num-1);
	}
  }
}
