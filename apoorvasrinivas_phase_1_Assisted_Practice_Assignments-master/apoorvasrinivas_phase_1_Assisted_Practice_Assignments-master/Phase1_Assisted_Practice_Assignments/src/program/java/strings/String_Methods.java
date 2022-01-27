package program.java.strings;

public class String_Methods {
	public static void main(String args[]){  
		
		String s1="javatprogram";  
		String s2="javatprogram";  
		String s3="JAVATPROGRAM";  
		String s4="python";  
		String s5="JAVATPOINT HELLO stRIng";  
		
		
		System.out.println(s1.equals(s2)); 
		System.out.println(s1.equals(s3));  
		System.out.println(s1.equals(s4));
		
		System.out.println("string length is: "+s4.length());    
		System.out.println("string length is: "+s2.length());  
			
		String name="JAVATPROGRAM";  
		String ch=name.substring(0,8);  
		System.out.println(ch);  
		
		String s1lower=s5.toLowerCase();  
		System.out.println(s1lower);           
		
		String s1upper=s5.toUpperCase();  
		System.out.println(s1upper);            
		
		
		
		}
	}  


