package program;
import java.util.*;
public class InputEvenOrOdd {
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number");
		int a=sc.nextInt();
		if(a%2==0) {
			
			System.out.println("Even Number");
		}
		else {
			
			System.out.println("Odd number");
		}

	}

}
