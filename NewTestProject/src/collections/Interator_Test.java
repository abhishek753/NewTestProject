package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Interator_Test {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("A");
		al.add("B");
		al.add("C");
		
        // Iterator to traverse the list 
		Iterator iterator = al.iterator();
		System.out.println("List Elements : ");
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+" ");
		}
		
	
	}
	}