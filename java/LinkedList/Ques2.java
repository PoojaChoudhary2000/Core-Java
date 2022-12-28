import java.util.LinkedList;
import java.util.Iterator;


public class Ques2{
public static void main(String[] args){

LinkedList<Character> ll = new LinkedList<Character>();

ll.add('a');
ll.add('e');
ll.add('i');
ll.add('o');
ll.add('u');

Iterator i =ll.iterator();

while(i.hasNext()){
int i1 = (int)i.next();
System.out.println(i1);
}

}
}
