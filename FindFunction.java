package printhello;

import java.util.*;

public class FindFunction {
	
	void evenorodd(int num) {
		
		if(num%2 == 0) {
			
			System.out.println("Even number");
		}
		else {
			
			System.out.println("Odd number");
		}
	}
    
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		
		FindFunction obj1=new FindFunction();
		
		int number=sc.nextInt();
		obj1.evenorodd(number);
		
		
		
		
		

	}

}
