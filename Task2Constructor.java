package program;

public class Task2Constructor {
	
	String name;
	String color;
	
	Task2Constructor(String n,String c){
		
		name=n;
		color=c;
	}
	
	void displaydog() {
		
		System.out.println("The Dog name is "+name);
		System.out.println("The Dog Color is "+color);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task2Constructor dog= new Task2Constructor("Jimmy","Brown");
		
		dog.displaydog();

	}

}
