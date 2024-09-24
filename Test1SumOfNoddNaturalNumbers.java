package program;
import java.util.*;
public class Test1SumOfNoddNaturalNumbers {
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int sum=0;
		int count=0;
		int num=1;
		
		while(count<n) {
		    
        	sum+=num;
			num+=2;
			count++;
			
			if(count%2==0) {
				
				System.out.println("Even");
			}
			else {
				
				System.out.println("Odd");
			}
		}
		
		System.out.println("The sum of the first "+n+" Odd natural numbers is: "+sum);

	}

}
