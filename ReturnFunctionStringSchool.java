package printhello;

import java.util.*;
public class ReturnFunctionStringSchool {
	
	String passorfail(int score) {
		
		if(score<35) {
			
			return"fail";
		}
		else {
		
		return "pass";
	}
	}
    static Scanner sc=new 	Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number");
		int total_mark=sc.nextInt();
		ReturnFunctionStringSchool result=new ReturnFunctionStringSchool();
		String name=result.passorfail(total_mark);
		System.out.println(name);
		
	}

}
