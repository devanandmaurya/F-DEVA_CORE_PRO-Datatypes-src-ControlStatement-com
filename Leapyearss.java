package ControlStatement.com;

public class Leapyearss {

public static void main(String[] args) {
	int y=20005;
	if((y%400==0)||(y%4==0 && y%100==0))
{
	System.out.println("lp hai");
}
	else
	{
		System.out.println("not lp");
	}
}
}
