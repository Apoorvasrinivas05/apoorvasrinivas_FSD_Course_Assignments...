package program.java.inner.classes;

public class Member_Inner {  
		 
		private int data=30;  
		
		void display(){
			System.out.println("i am inside the outer class method");
		}
		 
		class Inner{  		
			// private int data=20;
			  
			  void msg()
			  {
				  Member_Inner.this.display();
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
				  Member_Inner.this.display();
				  System.out.println("data is "+data);
			  }  
			  
			  
			  void display(){
				  System.out.println("i am inside the inner class method");
			  }
			 }  

		
		public static void main(String args[]){  
		  
		  Member_Inner obj=new Member_Inner();     // creating object of Outer class
		  
		  Member_Inner.Inner in=obj.new Inner();
		  Member_Inner.Inner1 in1 =obj.new Inner1();   // creating object of Inner class
		  in.msg();  
		  in.display(); 
		  in1.msg();
		  in1.display(); 
		  

		 }  
		} 

