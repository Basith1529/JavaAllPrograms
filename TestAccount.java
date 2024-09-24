package printhello;



	class Account {
	int acc_no;//attribute
	String name;
	float amount; //initial amount
	//Method to initialize object
	void insert(int a,String n,float amt)//a,n,amt_parameters
	{
		acc_no=a;
		name=n;
		amount=amt;
	}
	
	//deposit method
	void deposit(float amt) {
		amount=amount+amt;
		System.out.println(amt+"deposited");
	}
	
	//withdraw method
	void withdraw(float amt) {
		if(amount<amt) {
			System.out.println("Insufficient ");
		}
		else {
			amount=amount-amt;
			System.out.println(amt+"withdrawn");
		}
	}
	//Method to check the balance of the amount
	void checkbalance()
	{
		System.out.println("Balance is: "+amount);
		
	}
	//Method to Display the values of an object
	void display() {
		System.out.println(acc_no+" "+name+" "+amount);
	}
	}
	
	//Creating a test class to deposit and withdraw amount
	class TestAccount{
		public static void main(String[] args) {
			Account a1=new Account();
			a1.insert(7648346,"Basith", 1000); //method parsing(using object)
			a1.display(); //method passing
			a1.checkbalance(); //method passing(without object)|
			a1.deposit(40000); //method parsing
			a1.checkbalance(); //method passing
			a1.withdraw(15000); //method parsing
			a1.checkbalance(); //method passing
		}
	
	}




	


