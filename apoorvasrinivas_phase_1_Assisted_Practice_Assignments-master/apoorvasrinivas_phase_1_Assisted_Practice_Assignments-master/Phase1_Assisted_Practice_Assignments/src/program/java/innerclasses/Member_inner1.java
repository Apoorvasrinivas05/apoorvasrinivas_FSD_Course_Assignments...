package program.java.innerclasses;


public class Member_inner1 {
	private int data=30;  
	
	void display(){
		System.out.println("i am inside the outer class method");
	}
	 
	class Inner{  		
		// private int data=20;
		  
		  void msg()
		  {
			  Member_inner1.this.display();
			  System.out.println("data is "+data);
		  }  
		  
		 
		  void display(){
			  System.out.println("i am inside the inner class method");
		  }
		 }  
	class Inner1{  		
		//private int data=40;
		  
		  void msg()
		  {
			  Member_inner1.this.display();
			  System.out.println("data is "+data);
		  }  
		  
		  
		  void display(){
			  System.out.println("i am inside the inner class method");
		  }
		 }  

	
	public static void main(String args[]){  
	  
	  Member_inner1 obj=new Member_inner1();     // creating object of Outer class
	  
	  Member_inner1.Inner in=obj.new Inner();
	  Member_inner1.Inner1 in1 =obj.new Inner1();   // creating object of Inner class
	  in.msg();  
	  in.display(); 
	  in1.msg();
	  in1.display(); 
	  

	 }  
	} 


