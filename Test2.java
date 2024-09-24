package program;
import java.util.*;


public class Test2 {
	
	
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Student name");
		String name=sc.nextLine();
		
		System.out.println("Enter the Rollnumber");
		int rollno=sc.nextInt();
		
		System.out.println("Enter the English mark");
		int english=sc.nextInt();
		
		System.out.println("Enter the Tamil mark");
		int tamil=sc.nextInt();
		
		System.out.println("Enter the Maths mark");
		int maths=sc.nextInt();
		
		System.out.println("Enter the Science mark");
		int science=sc.nextInt();
		
		System.out.println("Enter the Social mark");
		int social=sc.nextInt();
		System.out.println();
		
		System.out.println("Student Name: "+name);
		System.out.println("Roll Number:  "+rollno);
		System.out.println("English Mark: "+english);
		System.out.println("Tamil   Mark: "+tamil);
		System.out.println("Maths   Mark: "+maths);
		System.out.println("Science Mark: "+science);
		System.out.println("Social  Mark: "+social);
		System.out.println();
		
		
		int sum=(english+tamil+maths+science+social);
		System.out.println("Total Marks: "+sum);
		System.out.println();
		
		int avg=sum/5;
		System.out.println("Average: "+avg+"%");	
		
	}

}
