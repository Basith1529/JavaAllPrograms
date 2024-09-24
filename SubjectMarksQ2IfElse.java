package printhello;
import java.util.*;
public class SubjectMarksQ2IfElse {
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Mark1");
		int s1=sc.nextInt();
		System.out.println("Enter the Mark2");
		int s2=sc.nextInt();
		System.out.println("Enter the Mark3");
		int s3=sc.nextInt();
		System.out.println("Enter the Mark4");
		int s4=sc.nextInt();
		System.out.println("Enter the Mark5");
		int s5=sc.nextInt();
		
		int totalmark = (s1+s2+s3+s4+s5);
		
		int avg=totalmark/5;
		
		if(avg<35) {
			
			System.out.println("Additional class is required");
		}
		else {
			
			System.out.println("You are good to go");
		}

	}

}
