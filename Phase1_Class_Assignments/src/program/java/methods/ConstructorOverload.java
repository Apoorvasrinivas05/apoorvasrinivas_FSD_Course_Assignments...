package program.java.methods;

public class ConstructorOverload {
    ConstructorOverload()
    {
    	
    }
    int a;
    float b;
    double z;
    
    ConstructorOverload(int x)
    {
    	a=x*x;
    }
    
    ConstructorOverload(float x,float y)
    {
    	b=x*y;
    }

    ConstructorOverload(double x)
    {
    	z=3.14f*x*x;
    }

    
    void Area()
    {
    	System.out.println("Area of square " + a);
    	System.out.println("Area of rectangle "+ b);
    	System.out.println("Area of circle "+ z);
    }
    public static void main(String[] args) {
    	ConstructorOverload C=new ConstructorOverload(3.5);
    	C.Area();
    	ConstructorOverload d=new ConstructorOverload(3.21f,4.4f);
    	d.Area();
    	ConstructorOverload e=new ConstructorOverload(5f);
    	e.Area();
    }
}
