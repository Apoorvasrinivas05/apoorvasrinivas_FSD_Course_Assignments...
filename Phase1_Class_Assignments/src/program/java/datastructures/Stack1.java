package program.java.datastructures;

import java.io.*; 
import java.util.*; 

public class Stack1 {
	 public static void main(String[] args) 
	 { 
	     // Default initialization of Stack 
	     Stack stack1 = new Stack(); 

	     // Initialization of Stack using Generics 
	     Stack<String> stack2 = new Stack<String>(); 

	     // pushing the elements 
	     stack1.push("Mango"); 
	     stack1.push("Banana"); 
	     stack1.push("Grapes"); 
	     stack1.push("Apple"); 
	     stack1.push("Orange"); 
	     stack1.push("Banglore");
	     stack1.push("Pune");
	     stack1.push("Mysore");
	     stack1.push("Hyderabad"); 
	     stack1.push(40);
	     stack1.push(10); 
	     stack1.push(12); 
	     stack1.push(35);
	     stack1.push('k'); 
	     stack1.push('u'); 
	     
	   
	     System.out.println(stack1); 
	     System.out.println("Popped element from stack 1: " + stack1.pop()); 
	     System.out.println("Popped element from stack 1: " + stack1.pop()); 
	     System.out.println("Popped element from stack 1: " + stack1.pop()); 
	     System.out.println("Popped element from stack 1: " + stack1.pop()); 
	     System.out.println("Popped element from stack 1: " + stack1.pop()); 
	     System.out.println("The element at the top of the"+ " stack-1 is: " + stack1.peek());
	     System.out.println("Popped element from stack 1: " + stack1.pop()); 
	     System.out.println("Popped element from stack 1: " + stack1.pop()); 
	     System.out.println("Popped element from stack 1: " + stack1.pop()); 
	     System.out.println("Popped element from stack 1: " + stack1.pop()); 
	     System.out.println("The element at the top of the"+ " stack-1 is: " + stack1.peek());
	     System.out.println("The index of Apple and Mysore is: "+ stack1.indexOf("Apple"));
	     System.out.println("The index of Apple and Mysore is: "+ stack1.indexOf("Mysore"));
	 }
}
	     
