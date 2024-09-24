package program;
//import java.util.*;

public class ControlFlowIfElseIf {
//    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Enter the number");
		
//		int avg=sc.nextInt();
        int avg=50; 
		
		if(avg<50) {
			
			System.out.println("You are fail");
		}
		
		else if(avg>=50 && avg<=60) {
			
			System.out.println("You are D grade");
		}
		
		else if(avg>=60 && avg<=70) {
			
			System.out.println("You are C grade");
		}
		
		else if(avg>=70 && avg<=80) {
			
			System.out.println("You are B grade");
		}
		
		else if(avg>=80 && avg<=90) {
			
			System.out.println("You are A grade");
		}
		
        else if(avg>=90 && avg<=100) {
			
			System.out.println("You are O grade");
		}
		
		
		else {
			
			System.out.println("Invalid");
		}
		

	}

}
