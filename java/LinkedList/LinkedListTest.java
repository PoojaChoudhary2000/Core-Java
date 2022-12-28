
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		ll.add("Sterling");
		ll.add("Indore");
		ll.add("Sterling");
		ll.add(123);
		ll.add(55.5);
		ll.add(true);
		System.out.println(ll);
		ll.addFirst("Khushi");
		System.out.println(ll);
		ll.addLast("Gham");
		ll.add(null);
		ll.add(null);
		
		System.out.println(ll);

		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());


		Object o1 = ll.removeFirst();
		Object o2 = ll.removeLast();
	
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(ll);
	
	
	
	}

}
