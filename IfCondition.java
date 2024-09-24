package printhello;

import java.util.*;

public class IfCondition {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		
		System.out.println("Enter the number 1");
		int num1 =sc.nextInt();
		
		System.out.println("Enter the number 2");
		int num2 =sc.nextInt();
		if(num1>num2) {
			System.out.println("Number 1 is greater");
		}
		else {
			System.out.println("Number 2 is greater");
		}
	}

}
