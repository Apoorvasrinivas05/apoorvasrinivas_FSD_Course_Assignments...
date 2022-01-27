package program.java.threads;



public class Thread1 extends Thread  {  
	
	 public void run() {  
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
	 
	 public static void main(String args[]){  
		  
		  Thread1 m1=new Thread1();  
		  Thread1 m2=new Thread1();  
		  Thread1 m3=new Thread1();
		  
		  m1.setName("IT");
		  m2.setName("Finance");
		  m3.setName("HR");
		 
		  m1.setPriority(Thread.MIN_PRIORITY);  
		  m2.setPriority(Thread.MAX_PRIORITY);  
		  m3.setPriority(Thread.NORM_PRIORITY); 
		  
		  
		  m1.start();  
		  m2.start();  
		  m3.start();
		   
		 }  
		}  



