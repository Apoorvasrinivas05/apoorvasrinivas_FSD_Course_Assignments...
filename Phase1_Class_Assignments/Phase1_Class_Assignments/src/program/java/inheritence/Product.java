package program.java.inheritence;

public class Product {
	int id=78;
	String name ="Amul";
	void display()
	{
		System.out.println("id: "+id+" "+"Name: "+ name);
	}
}

class A extends Product {
	int count = 50;
	String category = "Butter";
	void display()
	{
		System.out.println("id: "+id+" "+"Name: "+ name+"count: "+count+"category: "+category);
	}
}

class B extends Product {
	int count = 90;
	String category = "Milk";
	void display()
	{
		System.out.println("id: "+id+" "+"Name: "+ name+"count: "+count+"category: "+category);
	}
}

class C extends Product {
	int count = 56;
	String category = " chocco";
	void display()
	{
		System.out.println("id: "+id+" "+"Name: "+ name+"count: "+count+"category: "+category);
	}
}

class subA extends A {
	int price =30;
	int totalprice=count*price;
	void display()
	{
		
		System.out.println("id: "+id+" "+"Name: "+ name+"count: "+count+"category: "+category+"price: "+price+"totalprice: "+totalprice);
	}
}

	class subB extends B {
		int price =10;
		int totalprice=count*price;
		void display()
		{
			System.out.println("id: "+id+" "+"Name: "+ name+"count: "+count+"category: "+category+"price: "+price+"totalprice: "+totalprice);
		}
	
	
public class Product { 
  public void main(String args[]){
	  subA A=new subA();
	  subB B=new subB();
	  C c=new C();
	  B.display();
	  A.display();
	  c.display();
  }
 }
}







	
	




