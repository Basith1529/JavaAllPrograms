package printhello;

import java.util.*;

public class ElseIfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score > 35 && score < 60) {
			
			System.out.println("Video Games");
		}
		else if(score > 60 && score < 90) {
			
			System.out.println("Iphone");
		}
		else if(score > 90 && score < 120) {
			
			System.out.println("Macbook");
		}
		else {
			System.out.println("BMW");
		}
         sc.close();
	}

}
