package program.java.innerclasses;

interface Age
{
	int x = 21;
	void getAge();
}
public class Anonymous_innerclass
{
	public static void main(String[] args)
	{
		MyClass obj=new MyClass();

		obj.getAge();	
	}
}

class MyClass implements Age
{
	@Override
	public void getAge()
	{
		// printing the age
		System.out.print("Age is "+x);
	}
}



