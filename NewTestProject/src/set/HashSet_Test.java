package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Test {

	public static void main(String[] args) {
		
		HashSet<String> hash = new HashSet<String>();
		
		// Adding elements into HashSet usind add() 
		hash.add("India");
		hash.add("Australia");
		hash.add("China");
		hash.add("India");// adding duplicate elements 
		
        // Displaying the HashSet 
		System.out.println(hash);
		System.out.println("List Contains India or not : "+hash.contains("India"));
		
        // Removing items from HashSet using remove() 
		hash.remove("Australia");
		System.out.println("List after removing Australia :"+hash);
		
        // Iterating over hash set items 
		System.out.println("Iterating over List :");
		Iterator<String> i = hash.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
