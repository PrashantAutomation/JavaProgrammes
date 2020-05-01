import java.lang.reflect.*;
class Student{
	
	public String getName()
	{
		return "Prashant";
	}
	public int getMarks()
	{
		return 10;
	}	
}
public class Test {

	public static void main(String[] args) {
		// This program proves that class loading for a class is done only once i.e first time when it is executed
		Student s1 = new Student();
		Class c1 = s1.getClass();
		Student s2 = new Student();
		Class c2 = s2.getClass();
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());	
	}

}
