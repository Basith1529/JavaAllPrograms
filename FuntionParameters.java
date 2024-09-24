package printhello;

public class FuntionParameters {
      void getsoap(int money) {
    	  
    	  System.out.println(money);
    	  System.out.println("Soap Purchased");
      }
      
      void chocolate(int money) {
    	  
    	  System.out.println(money);
    	  System.out.println("Chocolate Purchased");
      }
      void earbuds(int money) {
    	  
    	  System.out.println(money);
    	  System.out.println("Earbuds Purchased");
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FuntionParameters num=new FuntionParameters();
		num.getsoap(20);
		System.out.println();
		num.chocolate(50);
		System.out.println();
		num.earbuds(800);

	}

}
