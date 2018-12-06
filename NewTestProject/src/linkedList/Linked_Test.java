package linkedList;

import java.util.LinkedList;

import org.apache.commons.lang3.SystemUtils;

public class Linked_Test {

	public static void main(String[] args) {
		
		//Creating object of class Linked List
		LinkedList<String> object = new LinkedList<String>();
		
		//Adding element to the Linked List
		object.add("A");
		object.add("B");
		object.add("D");
		object.addFirst("C");
		object.add(2, "E");
		object.add("F");
		object.add("G");
		
		System.out.println("Linked List : "+object);
		
		//Removing elements  from the Linked List
		object.remove("B");
		object.remove(3);
		object.removeFirst();
		object.removeLast();
		
		System.out.println("Linked List after deletion: "+object);
		
		//Finding elements  in the Linked List
		boolean status = object.contains("F");
		
		if(status) {
			System.out.println("List contains the element 'F' ");
		}
		else
			System.out.println("List doesn't contains the element 'F' ");

		//Number of element in the Linked List
		int size = object.size();
		System.out.println("Size of Linked List: "+size);
		
		//Get and set elements from Linked List
		Object element =  object.get(2);
		System.out.println("Element returned by get() : "+element);
		object.set(2, "K");
		System.out.println("Linked List after change: "+object);
	}

}
