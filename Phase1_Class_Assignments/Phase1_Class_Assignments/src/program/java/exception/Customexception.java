package program.java.exception;

public class Customexception {
	  static void validate(int Sal)throws InvalidSalException{  
		     if(Sal<2100)   
		      System.out.println("you need to work hard");
	         if(Sal>2100 && Sal<5000)
	        	 System.out.println("you salary is somehow good");
	         if(Sal>5100 && Sal<9000)
	        	 System.out.println("salary is very good");
	  }
	         
	    	   
		   public static void main(String args[]){  
		      try{  
		        validate(8000);  
		      }
		      catch(Exception m)
		      {
		    	  System.out.println("Exception occured: "+ m.getMessage());
		      }  
		  
		      System.out.println("rest of the code...");  
		  }  
		}  

	
	class InvalidSalException extends Exception{  // 1
	

		//private static final long serialVersionUID = 1L;

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		InvalidSalException(String s){  //2
		  super(s);  
		 }  
	}  
