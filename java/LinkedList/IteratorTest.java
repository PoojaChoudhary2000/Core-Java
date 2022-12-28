import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);

		Iterator i = al.iterator();

		//al.add(11);
		
		
		while (i.hasNext()) {
			int i1 = (int) i.next();
			if (i1 % 2 == 0) {
				i.remove();
			}
			System.out.println(i1);
		}

		System.out.println(al);

	}

}