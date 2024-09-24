package printhello;

import java.util.*;
public class ReturnFunctionScore {
   
	String oddoreven(int num) {
		
		if(num%2==0) {
			
			return "Even";
		}
		else {
			
			return "odd";
		}
	}
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number");
		int number=sc.nextInt();
		
		ReturnFunctionScore result=new ReturnFunctionScore();
		String name=result.oddoreven(number);
		
		System.out.println(name);
		

	}

}
