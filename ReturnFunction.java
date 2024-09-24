package printhello;

public class ReturnFunction {
	
	

	String getname() {
		
		String get_name="Basith";
		
		return get_name;
	}
	
	    String getphone() {
		
		String a="9159916437";
		return a;
	}
	    
	    String getadd(){
	    	
	    	String get_add="Pudupattinam";
	    	
	    	return get_add;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReturnFunction name=new ReturnFunction();
		
		String myname=name.getname();
		System.out.println(myname);
		
		String num=name.getphone();
		System.out.println(num);
		
		String add=name.getadd();
		System.out.println(add);

	}

}
