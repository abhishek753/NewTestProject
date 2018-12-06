package wrapper;

import java.util.ArrayList;

public class Autoboxing_Demo {

	public static void main(String[] args) {
		
		char ch = 'a';
		
		//Autoboxing - primitive to Character object conversion
		Character a = ch;
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		//Autoboxing because ArrayList stores only object
		arrayList.add(25);
		
		//printing the value of object
		System.out.println(arrayList.get(0));
		
	}

}
