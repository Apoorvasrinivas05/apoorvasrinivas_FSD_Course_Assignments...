package program.java.Regx;

import java.util.regex.Pattern;

public class Regular_Expression {
	  public static void main(String args[]) 
	    { 
	        System.out.println (Pattern.matches("^(.+)@(.+)$", "firstname@gmail.com")); 
	        System.out.println (Pattern.matches("^(.+)@(.+)$", "virendra@gmail.com")); 
	        System.out.println (Pattern.matches("^(.+)@(.+)$", "test123prepare@co.edu.com"));
	        System.out.println (Pattern.matches("^\\d{10}$", "919456738298"));
	        System.out.println (Pattern.matches("^(?=.*[0-9]).{8,15}$", "AlphaRomeo4c"));
	        
	        
	    }
	  
}




