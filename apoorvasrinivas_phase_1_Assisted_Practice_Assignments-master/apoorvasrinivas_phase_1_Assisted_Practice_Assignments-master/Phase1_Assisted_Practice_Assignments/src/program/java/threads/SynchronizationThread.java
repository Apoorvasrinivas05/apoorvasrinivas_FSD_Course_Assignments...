package program.java.threads;

class Table {
	 synchronized public void getTable() {  
		  for(int i=1;i<4;i++){  
		    try{
		    		Thread.sleep(2000); 
		    	}
		    catch(InterruptedException e)
		    {
		    	System.out.println(e);
		    }  
		    System.out.println(Thread.currentThread().getName()+ "  :"+ i); 
		 
			System.out.println("running thread state is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getState()); 
			System.out.println("running thread name is:"+Thread.currentThread().getName()); 
			System.out.println("Is my thread alive or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isAlive()); 
			System.out.println("The thread id is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getId());
		  }
		 }
}
class MyThread extends Thread
{
	
	Table table;

	MyThread(Table table)
	{
		this.table = table;
	}

	@Override
	public void run()
	{
		table.getTable();
	}
}
public  class SynchronizationThread {

public static void main(String args[]) { 

	  
	  Table obj = new Table();
	  
	  
	  MyThread m1=new MyThread(obj);  
	  MyThread m2=new MyThread(obj);  
	  MyThread m3=new MyThread(obj);
	  
	  m1.setName("IT");
	  m2.setName("Finance");
	  m3.setName("HR");
	 
	 
	  m1.start();  
	  m2.start();  
	  m3.start();
	   
	 }
}


