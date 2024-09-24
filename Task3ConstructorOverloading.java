package program;

public class Task3ConstructorOverloading {
       
	String title;
	String author;
	int price;
	
	public Task3ConstructorOverloading() {
		
		System.out.println("The Book is Title,Author and Price");
	}
	
	 Task3ConstructorOverloading(String title,String author) {
		
		System.out.println("The Book Title is "+title);
		System.out.println("The Book Author is "+author);
	}
	 
	 Task3ConstructorOverloading(String title,String author,int price){
		 
		 System.out.println("The Book Title is "+title);
		 System.out.println("The Book Author is "+author);
		 System.out.println("The Book Price is "+"Rs."+price);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Task3ConstructorOverloading book=new Task3ConstructorOverloading();
		System.out.println();
		Task3ConstructorOverloading book1=new Task3ConstructorOverloading("Game of Throne","Edwards Richard");
		System.out.println();
		Task3ConstructorOverloading book2=new Task3ConstructorOverloading("Pirates of Carribian","Jhonny Tep",1500);
		
		

	}

}
