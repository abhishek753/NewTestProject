package Collection.Collections;

import java.util.Hashtable;

public class TestHashTable {

	public static void main(String[] args) {
		
		Hashtable<String,String> ht = new Hashtable<String,String>();
		ht.put("Name","Abhishek");
		ht.put("Location", "Noida");
		ht.put("Course","Selenium");
		
		System.out.println(ht.get("Location"));

	}

}
