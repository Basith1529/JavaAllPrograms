package printhello;

public class FunctionsAdding {
        
	int a=10;
	int b=20;
	
	void num() {
		
		System.out.println(a+b);
//		num1();
//		num2();
//		num3();
	}
    void num1() {
		
		System.out.println(a*b);
		
	}
    void num2() {
	
	System.out.println(b/a);
    }
    void num3() {
	
	System.out.println(b-a);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionsAdding num=new FunctionsAdding();
		num.num();
		num.num1();
		num.num2();
		num.num3();
	

	}

}
