package program.java.strings;

public class ImmutableExamples {
	public static void main(String args[]){  
		 
		   String y= new String("Mumbai");  
		   String p = new String ("Hello");
		   
		   if(y.equals(p))
		   {
			   System.out.println("true....");
		   }
		   else{
			   System.out.println("false....");
		   }
		   
		   y.concat(" pune");      
		   y = y.concat(" pune");
		   
		   System.out.println(y);       
		   
		   if(y.equals(p))
		   {
			   System.out.println("true....");
		   }
		   else{
			   System.out.println("false....");
		   }
		   
		   String s4 = "World";     
		   String s5 = "Hello";
		   
		  
		   String s1 = new String("World");
		   String s3 = new String("World");
		   String s2 = new String("World");
		   
		   if(s1.equals(s3))
		   {
			   System.out.println("true?????");
		   }
		   else{
			   System.out.println("false????");
		   }
		 }  
	 }


