package printhello;
import java.util.Scanner;
public class DoWhileLoopInput {
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		
		int count=0;
		do {
			System.out.println("Enter the number > 10:");
			  count = sc.nextInt();
		}while(count<10);
			
		}

	}


