package printhello;

public class ReturnKeyword {
	
	int getchocolate(int money) {
		
		int chocolate_price=50;
		int rem=80-50;
		return rem;
		
	}
	
	int getsoap() {
		
		return 100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReturnKeyword key=new ReturnKeyword();
		
		int reminder = key.getchocolate(80);
		
		System.out.println(reminder);
		
		int reminder1=key.getsoap();
		System.out.println(reminder1);

	}

}
