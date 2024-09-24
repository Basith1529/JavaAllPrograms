package program;

public class EvenOddNumbersForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		int[] num= {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Even Numbers");
		
		for(int number:num) {
			
			if(number%2==0) {
				
				System.out.println(number);
			}
		}
		
		System.out.println("Odd Number");
		
		for(int number:num) {
			
			if(number%2!=0) {
				
				System.out.println(number);
			}
		}


	}

}
