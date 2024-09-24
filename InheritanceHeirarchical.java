package printhello;

//Heirarachical Inheritance

class Animall{
	
	void eat() {
		
		System.out.println("This Animals Eats");
	}
}

class Dogs extends Animall{
	
	void bark() {
		
		System.out.println("Dog Barks");
	}
}

class Cat extends Animall{
	
	void meow() {
		
		System.out.println("Cat Meow");
	}
}
public class InheritanceHeirarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat c1= new Cat();
		
		c1.meow();

	    c1.eat();

	}

}
