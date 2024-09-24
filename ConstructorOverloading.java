package program;

public class ConstructorOverloading {
      
	int id;
	String name;
	int age;
	
	public ConstructorOverloading(int a,String b) {
		
		id=a;
		name=b;
	}
	
	ConstructorOverloading(int a,String b,int c){
		
		id=a;
		name=b;
		age=c;
	}
	
	void display() {
		
		System.out.println(id+" "+name+" "+age);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading stud=new ConstructorOverloading(2906,"Basith");
		
		ConstructorOverloading stud1=new ConstructorOverloading(2906,"Basith",25);
		
		stud.display();
		stud1.display();
		
		

	}

}
