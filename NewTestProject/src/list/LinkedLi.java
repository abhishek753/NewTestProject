package list;

import java.util.LinkedList;

public class LinkedLi {

	public static void main(String[] args) {
		
		LinkedList<String> obj = new LinkedList<String>();
		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.add("D");
		obj.add("E");
		obj.add("F");
		obj.add("G");
		
		System.out.println("Linked list : "+obj);
		
		obj.remove("B");
		obj.remove(3);
		obj.removeFirst();
		obj.removeLast();
		
		System.out.println("Linked List after deletion: "+obj);
		
		boolean status = obj.contains("E");
		
		if(status)
			System.out.println("List contains the element 'E' ");
		else
			System.out.println("List doesn't contains the element 'E' ");
		
		int size = obj.size();
		System.out.println("Size of Linked list : "+size);
		
		Object element = obj.get(2);
		System.out.println("Element returned by get() : "+element);
		
		obj.set(2, "Y");
		System.out.println("Linked list after change : "+obj);
		
		

	}

}
