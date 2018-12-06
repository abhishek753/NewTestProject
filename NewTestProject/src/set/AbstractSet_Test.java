package set;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class AbstractSet_Test {

	public static void main(String[] args) {
		try {
			 // Creating object of AbstractSet<Integer> 
			AbstractSet<Integer> abs_set = new TreeSet<Integer>();
			
			// Populating abs_set 
			abs_set.add(1);
			abs_set.add(2);
			abs_set.add(3);
			abs_set.add(4);
			abs_set.add(5);
			
			  // print abs_set 
			System.out.println("AbstractSet before removeAll() operation :"+abs_set);
			
			// Creating another object of ArrayList<Integer> 
			ArrayList<Integer> arrlist = new ArrayList<Integer>();
			
			arrlist.add(1);
			arrlist.add(2);
			arrlist.add(3);
			
			 // print arrlist
			System.out.println("Collection Elements to be removed :"+arrlist);
			
			// Removing elements from AbstractSet 
            // specified in arrlist2 
            // using removeAll() method 
			abs_set.removeAll(arrlist);
			
			 // print arrlist 
			System.out.println("AbstractSet after removeAll() operation : "+abs_set);
		}
		catch(NullPointerException e){
			System.out.println("Exception thrown : " + e);
		}
	}

}
