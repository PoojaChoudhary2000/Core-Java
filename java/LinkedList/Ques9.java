import java.util.LinkedList;

public class Ques9{
public static void main(String[] args){

LinkedList<Integer> ll = new LinkedList<Integer>();

ll.add(10);
ll.add(20);
ll.add(30);
ll.add(40);
ll.add(50);
ll.add(60);
ll.add(70);
ll.add(80);
ll.add(90);
ll.add(100);

System.out.println(ll);
System.out.println(ll.removeAll(ll));
System.out.println(ll);
}
}