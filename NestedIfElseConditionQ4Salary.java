package printhello;
import java.util.*;
public class NestedIfElseConditionQ4Salary {
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter your salary");
		int salary = sc.nextInt();
		
		System.out.println("What is your age");
		int age = sc.nextInt();
		
		if(salary>=20000 || age<=25) {
			
			System.out.println("Eligible for Loan");
			
			System.out.println("How much loan do you need?");
			int loan=sc.nextInt();
			
			if(loan<=50000) {
				
				System.out.println("Loan Available");
				
				
			}
			
			else {
				
				System.out.println("Not Available");
			}
		}
		

	}

}
