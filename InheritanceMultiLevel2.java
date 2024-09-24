package printhello;


	class Animals{

		void eat() {

			System.out.println("This Animals eats");
		}
	}

	class Doggy extends Animals{

		void bark() {

			System.out.println("Dog Barks");
		}
	}

	class Puppy extends Doggy{

		void weep() {

			System.out.println("Puppy Weep");
		}
	}

	public class InheritanceMultiLevel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy p1=new Puppy();

		p1.weep();
		p1.eat();
		p1.bark();


	}

}
