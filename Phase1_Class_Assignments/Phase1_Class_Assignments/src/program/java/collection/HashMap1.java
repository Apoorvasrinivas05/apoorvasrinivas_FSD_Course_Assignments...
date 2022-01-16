package program.java.collection;

import java.util.TreeMap;

public class HashMap1{
	public static void main(String[] args){
		
		TreeMap<Integer, String> treeHashMap =  new TreeMap<Integer, String>();
		    treeHashMap.put(1, new String("orange"));
	        treeHashMap.put(2, new String("apple"));
	        treeHashMap.put(3, new String("kiwi"));
	        treeHashMap.put(4, new String("mango"));
	        treeHashMap.put(5, new String("pineapple"));
	        treeHashMap.put(6, new String("cherry"));
	        treeHashMap.put(7, new String("banana"));
	        treeHashMap.put(8, new String("papaya"));
	        treeHashMap.put(9, new String("grapes"));
	        treeHashMap.put(10, new String("strawberry"));
	           
	        
	        System.out.println("Contents of LinkedHashMap : " + treeHashMap);
	        System.out.println("\nValues of map after iterating over it : ");
	        
	        for (Integer key : treeHashMap.keySet()) {
	            System.out.println(key + ":\t" + treeHashMap.get(key));
	        }
	        
	        System.out.println("\nThe size of the LinkedHashMap is : " + treeHashMap.size());
	        System.out.println("\nLinkedHashMap contains 4 as key? : " + treeHashMap.containsKey(4));
	        System.out.println("LinkedHashMap contains apple as value? : " + treeHashMap.containsValue("apple"));
	        System.out.println("LinkedHashMap contains banana as value? : " + treeHashMap.containsValue("banana"));
	        System.out.println("\nRemove entry for key 4 : " + treeHashMap.remove(4));
	        System.out.println("\nRemove entry for key 7 : " + treeHashMap.remove(7));
	        System.out.println("Content of LinkedHashMap after removing key 4: " + treeHashMap);
	        System.out.println("Content of LinkedHashMap after removing key 7: " + treeHashMap);
	        treeHashMap.clear();
	        System.out.println("\nContent of LinkedHashMap after clearing: " + treeHashMap);
	    }
		
	}






