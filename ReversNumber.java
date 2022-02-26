package ControlStatement.com;

public class ReversNumber {

	public static void main(String[] args) {
		
		int i=12564;
		System.out.println("The input num=i is:"+ i);

		int rev=0, rem;
		while(i!=0)
		{
			rem=i%10;
			
			rev= rev*10+rem;
		
		    i=i/10;
		   // System.out.println("The revers no is "+i);
		}
		//System.out.print(i);
		System.out.println("The revers no is:");
		System.out.println(rev);
	}
}
