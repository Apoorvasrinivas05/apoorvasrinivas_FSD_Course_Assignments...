package program.java.accessmodifiers;

public class Test1  {
	private int y= 10;   //private variable
	
	long k = 1000;    // default variable
	
	protected float point = 56.67f;  // protected variable
	
	public void methodPublic(){     // public method
		methodPrivate();
	}
	
	protected void methodProtected(){   // protected method
		methodPrivate();
	}
	
	void methodDefault(){    //default method
		methodPrivate();
	}
	
	private void methodPrivate(){     // private method
		System.out.println("Class Test1: methodProtected");
		System.out.println("Value of private valye y"+ y);
		System.out.println("Value of long"+ k);
		System.out.println("value of float"+ point);
	}

}


