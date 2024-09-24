package program;

public class ConstructorDefault {
	
	//Default Constructor
	public ConstructorDefault() //--Default constructor bcoz no args
	{
		
		//Initialization code (if any)
		System.out.println("This is my default constructor");
	}
	
	//Parameterized Constructor
	public ConstructorDefault(int a,int b) {
		
		int c=a+b;
		
		System.out.println("This is a parameter Constructor : Total :"+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Constructor is invoked while
		//creating an object of myclass
		ConstructorDefault def=new ConstructorDefault();
		
		int num1=30,num2=50;
		
		ConstructorDefault Def1=new ConstructorDefault(num1,num2);
	

	}

}
