package collections;

import java.util.AbstractCollection;
import java.util.ArrayList;

public class Abstract_Collections {

	public static void main(String[] args) {
		
		//Create an empty Collection
		AbstractCollection<Object> abs = new ArrayList<Object>();
		
		//Use add() method to add 
		//elements in the collection
		abs.add("Welcome");
		abs.add("To");
		abs.add("Greeks");
		abs.add("4");
		abs.add("Greeks");
		System.out.println("Abstarct Collection: "+abs);

	}

}
