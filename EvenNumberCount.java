package printhello;

public class EvenNumberCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int evencount=0;
		
		int a = 10;
		
		for(int i=1;i<=a;i++) {
			
			if(i % 2==0) {
				
				System.out.println(i);
			}
			else {
				
				evencount=evencount+1;
			}
		}
		System.out.println("Total Even Number Count: "+evencount);
		

	}

}
