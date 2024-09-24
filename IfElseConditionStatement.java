package program;
//import java.util.*;
public class IfElseConditionStatement {
    
//	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Enter the number");
		
//		int age =sc.nextInt();
		int age=23;
		
		if(age>18) {
			
			System.out.println("You are eligible to vote");
		}
		else {
			
			System.out.println("You are not eligible to vote");
		}
		
		if(age%2==0) {
			
			System.out.println("Even number");
		}
		
		else {
			
			System.out.println("Odd number");
		}

	}

}
