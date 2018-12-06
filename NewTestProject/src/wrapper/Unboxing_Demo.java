package wrapper;

import java.util.ArrayList;

public class Unboxing_Demo {

	public static void main(String[] args) {

		Character ch = 'a';
		
		//Unboxing - character object to primitive conversion
		char a = ch;
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(24);
		
		//Unboxing because get method returns an Integer object
		int num = arrayList.get(0);
		System.out.println(num);
	}

}
