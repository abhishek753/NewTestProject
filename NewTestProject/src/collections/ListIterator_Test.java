package collections;
import java.io.*; 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIterator_Test {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		ListIterator iterator = list.listIterator();
		System.out.println("Displaying list elements in forward direction : "); 
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+" ");
		}
		
		System.out.println("Displaying list elements in backward direction : "); 
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous()+" ");
		}

	}

}
