package printhello;
//Inheritance not using () 
class Dad{
	
    int money=2000;
}

class Son extends Dad{
	
	
}

public class Inheritance {
	
	
	String name;
	
	void setname(String name) {
		
		this.name=name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Son s1=new Son();
		
		System.out.println(s1.money);
		
		Inheritance obj=new Inheritance();
		obj.setname("Basith");
		System.out.println(obj.name);

	}

}
