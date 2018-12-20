package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		// Adds elements {0, 1, 2, 3, 4} to queue 
		for (int i=0; i<5; i++)
			q.add(i);
		
		 // Display contents of the queue. 
		System.out.println("Element of queue: "+q);
		
		// To remove the head of queue. 
		int removedele = q.remove();
		System.out.println("Remove element: "+removedele);
		
		// To view the head of queue 
		int head = q.peek();
		System.out.println("Head of queue: "+head);
		
		// Rest all methods of collection interface, 
	    // Like size and contains can be used with this 
	    // implementation.
		int size = q.size();
		System.out.println("Size of queue: "+size);

	}

}
