import java.lang.reflect.*;
public class MethodsOfClass {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		int count = 0;
		Class c = Class.forName("java.lang.Object");
		Method[] m = c.getDeclaredMethods();
		for(Method m1:m)
		{
			count++;
			System.out.println("The method names are " + m1.getName());
		}
		System.out.println(" The count of methods are =" + count);
	}

}
