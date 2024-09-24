package printhello;

public class OddNumberCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int oddcount=0;
		int a = 10;
		
		for(int i=1;i<=a;i++) {
			
			if(i % 2==1) {
				System.out.println(i);
				
			}
			else {
				
				oddcount = oddcount+1;
			}
		}
		System.out.println("Total Odd Number Count: "+oddcount);
		

	}

}
