package Collection.Collections;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> mylist = new ArrayList<String>();
		
		mylist.add("First Element"); //0
		mylist.add("Second Element"); //1
		mylist.add("Third Element"); //2
		
		System.out.println(mylist.get(2));
		System.out.println(mylist.size());
		
		for(int i=0; i<mylist.size(); i++) {
			System.out.println(mylist.get(i));
		}

	}

}
