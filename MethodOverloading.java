package printhello;

public class MethodOverloading {
	
	void display() {
		
		System.out.println("one");
		
	}
	
	void display(int a) {
		
		System.out.println("two");
	}
	void display(int a,int b) {
		
	    int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading obj=new MethodOverloading();
		
		obj.display();
		obj.display(90);
		obj.display(9,8);

	}

}
