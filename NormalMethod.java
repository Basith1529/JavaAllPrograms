package program;

public class NormalMethod {
	static int a=10;
	int b=20;
	void display() {
		
		System.out.println(a);
		System.out.println(b);
//	    staticDisplay();
	}
	static void staticDisplay() {
		
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NormalMethod obj=new NormalMethod();
		
		obj.display();
//		obj.staticDisplay(); //no need to call the object explicitly
		staticDisplay();
		

	}

}
