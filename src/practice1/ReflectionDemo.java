/**
 * 
 */
package practice1;

import java.lang.reflect.Method;

/**
 * @author welcome
 *
 */
public class ReflectionDemo {

public static void main(String args[]){
	try {
		Class c = Class.forName("ReflectionDemo");
		Method[] str = c.getDeclaredMethods();
	System.out.println("method1: " +str[0] );
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
//	System.out.println(getClass.getMethod());
}
}
