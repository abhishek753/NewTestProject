package list;

import java.util.ArrayList;

public class ArrayLi {

	public static void main(String[] args) {
		
		// size of ArrayList 
		int n = 5;
		
		 //declaring ArrayList with initial size n 
		ArrayList<Integer> arrayli = new ArrayList<Integer>(n);
		
		// Appending the new element at the end of the list 
		for(int i=1; i<=n; i++) 
			arrayli.add(i);
			
		// Printing elements 
			System.out.println(arrayli);
			
			 // Remove element at index 3 
			arrayli.remove(3);
			
			// Displaying ArrayList after deletion 
			System.out.println(arrayli);
			
			// Printing elements one by one 
		    for(int i=0;i<arrayli.size();i++) 
		    	System.out.println(arrayli.get(i)+" ");
			
		
	}

}
