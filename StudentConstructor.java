package program;

public class StudentConstructor {
	
	int id;
	String name;
	public StudentConstructor(int a,String n)  {
			
		id=a;
		name=n;
	}
		
		void display() {
			System.out.println(id+" "+name);
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		StudentConstructor stud=new StudentConstructor(05,"Basith");
		StudentConstructor stud1=new StudentConstructor(04,"Hamith");
		StudentConstructor stud2=new StudentConstructor(06,"Ajith");
		
		stud.display();
		stud1.display();
		stud2.display();


	}

}
