package program;


import java.util.*;

public class What { 
	public static void main(String args[])
	{
		Scanner basu = new Scanner(System.in);
		System.out.println("Enter the number1");
		int a =basu.nextInt();
		System.out.println("Enter the number2");
		int b =basu.nextInt();
		
		System.out.println("Adding");
		int c=a+b;
		
		System.out.println(c);
		
		System.out.println("Multiple");
		int e =a*b;
		System.out.println(e);
		
		System.out.println("Divisible");
		int f = a/b;
		System.out.println(f);
		
		System.out.println("Subtract");
		int g = a-b;
		System.out.println(g);
		
		System.out.println("Total");
		int h=(c+e+f+g);
		System.out.println(h);
		
		System.out.println("Average");
		int i = h/5;
		System.out.println(i);
		
		
		 basu.close();	
	}
      

}