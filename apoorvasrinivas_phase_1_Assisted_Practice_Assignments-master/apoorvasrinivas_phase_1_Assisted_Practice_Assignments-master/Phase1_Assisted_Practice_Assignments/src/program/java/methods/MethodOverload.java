package program.java.methods;

public class MethodOverload {
	public void Calculate(float h,int s)
	{
		System.out.println("prnting the value "+( h + s));
	}
	
	public void calculate(float g,int c)
	{
		System.out.println("prnting the value "+ g + "---" +c);
	}
	
	public void calculate(long w,int l)
	{
		System.out.println("prnting the value "+w*l);
	}
	
	
    public static void main(String args[])
    {
      MethodOverload ob=new MethodOverload();
      
	  ob.calculate(10,20);
      ob.calculate(10.15f,12);
      ob.calculate(20,45);  
    }
}



