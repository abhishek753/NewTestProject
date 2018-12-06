package collections;

import java.util.Hashtable;
import java.util.Vector;

public class Array_Vector_Hashtable {

	public static void main(String[] args) {
		
		//Creating instances of array,vector and hastable
		int arr[] = new int[] {8,2,3,4};
		Vector<Integer> v = new Vector();
		Hashtable<Integer,String> h = new Hashtable();
		v.addElement(9);
		v.addElement(2);
		h.put(1,"Greek");
		h.put(2, "4Greek");
		
		//Array instance creation requires [], while Vector 
        // and hashtable require () 
        // Vector element insertion requires addElement(), but 
        // hashtable element insertion requires put() 
		
		 // Accessing first element of array, vector and hashtable 
		System.out.println(arr[0]);
		System.out.println(v.elementAt(0));
		System.out.println(h.get(1)+h.get(2));

		// Array elements are accessed using [], vector elements 
        // using elementAt() and hashtable elements using get() 
	}

}
