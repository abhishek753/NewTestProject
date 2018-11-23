package Collection.Collections;

import java.util.Hashtable;

public class HashTestHashTable {

	public static void main(String[] args) {

		Hashtable<String, String> ht1 = new Hashtable<String, String>();
		ht1.put("Course1", "Selenium");
		ht1.put("Course2", "QTP");
				
		Hashtable<String, String> ht2 = new Hashtable<String, String>();
		ht2.put("Location1", "Delhi");
		ht2.put("Location2","Noida");
		
		Hashtable<String, Hashtable<String, String>> ht = new Hashtable<String, Hashtable<String, String>>();
		ht.put("Inititute", ht1);
		ht.put("Country", ht2);
		
		System.out.println(ht.get("Inititute").get("Course2"));
		System.out.println(ht.get("Country").get("Location2"));
		

	}

}
