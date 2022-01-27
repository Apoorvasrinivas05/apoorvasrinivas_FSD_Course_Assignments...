package program.java.constructors;


public class ParameterConstructor {
	int id;  
    String name;  
    
   public ParameterConstructor(){   //default-no parameters
    	System.out.println("inside");
    	
        }  
    
    //creating a parameterized constructor  
    public ParameterConstructor(int i,String n){   // two parameters
	    id = i;  
	    name = n;  
    }  
    
    //method to display the values  
    public void display()
    {
    	System.out.println(id+" "+name);
    }  
    
   
    public static void main(String args[]){  
    
    //creating objects and passing values 
    	 
    ParameterConstructor s1 = new ParameterConstructor(111,"Karan");  
    ParameterConstructor s2 = new ParameterConstructor(222,"Aryan");  
    
    
    //calling method to display the values of object  
    s1.display();  
    s2.display();  
   }  
}  

