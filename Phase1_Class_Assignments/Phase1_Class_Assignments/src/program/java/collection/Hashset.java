package program.java.collection;

import java.util.HashSet;

class Fruits{
	public static void main(String[] args){
		
		HashSet hs= new HashSet();
		
		String h = new String("g");
		
		hs.add("orange");
		hs.add("apple");
		hs.add("grapes");
		hs.add("pineapple");
		hs.add("mango");
		hs.add("banana");
		hs.add("straberry");
		hs.add("papaya");
		hs.add("kiwi");
		hs.add("cherry");
				
		System.out.println("Hashset is "+hs);
		System.out.println("Size of Hashset is "+ hs.size());
		
		System.out.println("Does hashset contains this 'orange' element  " + hs.contains("orange"));		
		System.out.println("is hashset empty  " + hs.isEmpty());
		System.out.println("add the element"+hs.add("peach"));
		System.out.println("add the element"+hs.add("pear"));
		System.out.println("add the  element"+hs.add("lime"));
		System.out.println("Hashset is "+hs);
		System.out.println("Size of Hashset is "+ hs.size());
		System.out.println("remove the element "+hs.remove("apple"));
		System.out.println("remove the element "+hs.remove("mango"));
		
		
	    hs.clear();
	    System.out.println("get class  " +hs.getClass());
		
	    System.out.println("is hashset empty  " +hs.isEmpty());
	    
	    
		
	}
}


