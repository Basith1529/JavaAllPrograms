package program;

public class TrMamTask3Greater3NumberElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=70;
		int num2=50;
		int num3=80;
		
		if(num1>=num2 && num2>=num3) {
			
			System.out.println("The greatest number is:"+num1);
		}
		
		else if(num2>=num1 && num2>=num3) {
			
			System.out.println("The greatest number is:"+num2);
		}
		
		else {
			
			System.out.println("The greatest number is:"+num3);
		}

	}

}
