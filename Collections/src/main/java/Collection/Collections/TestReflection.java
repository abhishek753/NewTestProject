package Collection.Collections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


//Using when we build the hybrid framework.

public class TestReflection {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		String x = "Click";//xls file
		
		Method method = TestReflection.class.getMethod(x,String.class);
		method.invoke(method,"Hi there");
	
	}
	public static void Click(String x) {
		System.out.println("Executing the Test: "+x);
	}

}
