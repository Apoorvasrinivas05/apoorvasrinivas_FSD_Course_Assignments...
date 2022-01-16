package program.java.accessmodifiers.child;

public class Test4 {
    private int e = 30;   //private variable
	
	long u = 678;       // default variable
	
	protected float point = 23.89f;
	
	public char gender = 'M';
	
	
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
		System.out.println("Class Test4: methodProtected");
		System.out.println("Value of private valye e"+ e);
		System.out.println("Value of long"+ u);
		System.out.println("value of protected float"+ point);
		System.out.println("value of public char"+ gender);
	}
} 

