package program;


enum Bikes{Honda,Hero,Yamaha,Java,Bajaj,BMW,Suzuki,TVS}
public class EnumSingSwitch {
//	enum Bikes{Honda,Hero,Yamaha,Java,Bajaj,BMW,Suzuki,TVS}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bikes b;
		b=Bikes.TVS;
		switch(b) {
		
		case Honda:
			System.out.println("Hurray!You have chosen Honda!");
			break;
			
		case Hero:
			System.out.println("Hurray!You have chosen Hero!");
			break;
			
		case Yamaha:
			System.out.println("Hurray!You have chosen Yamaha!");
			break;
			
		case Java:
			System.out.println("Hurray!You have chosen Java!");
			break;
			
		case Bajaj:
			System.out.println("Hurray!You have chosen Bajaj!");
			break;
			
		case BMW:
			System.out.println("Hurray!You have chosen BMW!");
			break;
			
		case Suzuki:
			System.out.println("Hurray!You have chosen Suzuki!");
			break;
			
		case TVS:
			System.out.println("Hurray!You have chosen TVS!");
			break;
		
			default:
				System.out.println("Hurray!You have not chosen in the list");
			
		}
		
		

	}

}
