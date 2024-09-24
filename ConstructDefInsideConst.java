package program;

public class ConstructDefInsideConst {
     
	int value;
	int value2;
	public ConstructDefInsideConst() {
	     
		value=10;
		value2=20;
		
		System.out.println("Inside Constructor");
	}
	
	public void display() {
		
		System.out.println("Value === "+value);
		System.out.println("Value2 === "+value2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructDefInsideConst def=new ConstructDefInsideConst();
		def.display();

	}

}
