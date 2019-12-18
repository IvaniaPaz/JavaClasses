package com.class31;

public class GettersAndSettersTest {

	public static void main(String[] args) {
		  GettersAndSetters obj=new GettersAndSetters();
		  obj.setAcc_no(756050400);
		  long acc=obj.getAcc_no();
		    
		     obj.setName("Sumair");
		    String acc1=obj.getName();
		   
		    obj.setEmail("sumair@syntaxsolutions.com");
		    String acc2=obj.getEmail();
		    
		     obj.setAmount(50000.0);
		    double acc3=obj.getAmount();
		    
		   System.out.print(acc+" "+acc1+" "+acc2+" "+acc3); 

	}

}
