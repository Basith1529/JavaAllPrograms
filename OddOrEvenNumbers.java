package printhello;

import java.util.*;

public class OddOrEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any number1");
	
		
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
	
		if(num % 2 == 0) {
			
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	
	
//		if(num % 2 == 1) {
//			System.out.println("Enter any number2");
//			System.out.println("Even");
//		}
//		else {
//			System.out.println("Odd");
//		}
		sc.close();
		}
	
	}

