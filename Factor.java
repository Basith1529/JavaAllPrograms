package printhello;

public class Factor {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Factor
        int sum = 0;
        int fact = 1;
        int a = 10;
        for(int i=1;i<=a;i++) {
        	
        	if(i % 2 == 0) {
        		sum = sum+i;
//        		System.out.println(i);
        	}
        	else {
        		fact = fact *i;
        	
        	}
        	
        }
           
      
           if(sum%2==0) //even
        	   {
        	   System.out.println("even");
        	   }
           else
           {
        	   System.out.println("odd");
           }
           System.out.println(sum);
                    if(fact%2==0) {
        	   System.out.println("even");
        	   }
           else
           {
        	   System.out.println("odd");
           }
           System.out.println(fact); 
           
           System.out.println("Total");
           int b = fact+sum;
           System.out.println(b);
           
           if(b % 2==1)//odd
           {
        	   System.out.println("This is a odd number");
        	   
           }
           else
           {
        	   System.out.println("This is a even number");
           }
           
           int c=sum*fact;
           System.out.println(c);
           
           if(c % 2 == 1)
           {
        	   System.out.println("This is a odd");
           }
           else {
        	   System.out.println("This is a even");
           }
           
           int d=fact/sum;
           System.out.println(d);
           if(d % 2 == 1)
           {
        	   System.out.println("This is a odd");
           }
           else {
        	   System.out.println("This is a even");
           }
            
           if(d % 2 == 1 && c % 2 == 1 && b % 2 == 1 && fact % 2 == 1 && sum % 2 == 1)
           {
        	   System.out.println("This is a odd");
           }
           else {
        	   System.out.println("Invalid");
           }
           }
	
}
        	
        
	


