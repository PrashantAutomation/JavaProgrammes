import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList l = new ArrayList();
		for(int i = 0; i<=10; i++)
		{
			l.add(i);
		}
		System.out.println(l);
		Iterator i = l.iterator();
		while(i.hasNext())
		{
			Integer var = (Integer) i.next();
			//To print the even numbers in the list
			if(var%2 == 0)
			{
				System.out.println(var);
			}
			else
				i.remove();
		}
		System.out.println(l);
	}

}
