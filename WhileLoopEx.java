package printhello;
import java.util.Random;
public class WhileLoopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Random rand=new Random();
		
		int newnum=0;
		
		while(newnum!=5) {
			
			 int bound;
			newnum=rand.nextInt(bound=11);
			 System.out.println(newnum);
			 
			 
		}
		

	}

}
