package program.java.accessmodifiers.child;

import program.java.accessmodifiers.Test1;
import program.java.accessmodifiers.Test2;

public class Test5 extends Test2{

	public static void main(String[] args) {
		System.out.println("variable of Test1 class");
		new Test1().methodPublic();
		
	    System.out.println("variable of Test2 class");
	    new Test2().methodPublic();
	    
	    System.out.println("variable of Test4 class");
		System.out.println("Variable of u: "+new Test4().u);
		System.out.println("Variable of float: "+new Test4().point);
		System.out.println("variable of char: "+new Test4().gender);
	}
}
