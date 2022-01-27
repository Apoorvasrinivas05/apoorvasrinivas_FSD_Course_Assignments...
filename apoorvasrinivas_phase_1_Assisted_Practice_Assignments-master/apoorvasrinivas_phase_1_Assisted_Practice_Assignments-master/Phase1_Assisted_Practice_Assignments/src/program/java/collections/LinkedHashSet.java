package program.java.collections;

import java.util.LinkedHashSet;

class Fruits1 {
	public static void main(String[] args){
		
		LinkedHashSet hs1= new LinkedHashSet();
		
		String h = new String("g");
		
		hs1.add("orange");
		hs1.add("apple");
		hs1.add("grapes");
		hs1.add("pineapple");
		hs1.add("mango");
		hs1.add("banana");
		hs1.add("straberry");
		hs1.add("papaya");
		hs1.add("kiwi");
		hs1.add("cherry");
				
		System.out.println("LinkedHashset is "+hs1);
		System.out.println("Size of LinkedHashset is "+ hs1.size());
		
		System.out.println("Does Linkedhashset contains this 'orange' element  " + hs1.contains("orange"));		
		System.out.println("is Linkedhashset empty  " + hs1.isEmpty());
		System.out.println("add the element"+hs1.add("peach"));
		System.out.println("add the element"+hs1.add("pear"));
		System.out.println("add the  element"+hs1.add("lime"));
		System.out.println("LinkedHashset is "+hs1);
		System.out.println("Size of LinkedHashset is "+ hs1.size());
		System.out.println("remove the element "+hs1.remove("apple"));
		System.out.println("remove the element "+hs1.remove("mango"));
		
		
	    hs1.clear();
	    System.out.println("get class  " +hs1.getClass());
		
	    System.out.println("is Linkedhashset empty  " +hs1.isEmpty());
	    
	    
		
	}
}



