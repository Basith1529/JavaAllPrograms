package printhello;
import java.util.*;
public class Q5 {
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Integer Number");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = (a*b*c);
		System.out.println("The Multiply number:"+d);
		
		int e = (a+b+c);
		System.out.println("The Adding number:"+e);
		
		int f = (d/e);
		System.out.println("The Divide number:"+f);
		
		int g = (a-b-c);
		System.out.println("The Subtract number is:"+g);

	}

}
