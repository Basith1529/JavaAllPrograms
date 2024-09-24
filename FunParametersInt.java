package printhello;

public class FunParametersInt {
           
	void sum(int a,int b) {
		
		System.out.println("Adding Total Numbers");
		System.out.println(a+b);

	}
	
	void mul(int a,int b) {
		
		System.out.println("Multiple Number");
		System.out.println(a*b);
	}
	
	void sub(int a,int b) {
		
		System.out.println("Subtract Number");
		System.out.println(a-b);
	}
	
	void div(int a,int b) {
		
		System.out.println("Divide Number");
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunParametersInt maths=new FunParametersInt();
		maths.sum(78,45);
		maths.mul(67, 4);
		maths.sub(90,50);
		maths.div(100, 10);

	}

}
