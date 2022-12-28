import java.util.ArrayList;

public class Ques3{
public static void main(String[] args){

ArrayList al = new ArrayList();

al.add("Kapil");
al.add("Poonam");
al.add("Pooja");
al.add("Anuja");
al.add("Durga");
al.add("Sonali");
al.add("Sonali");

System.out.println(al);
al.add(0,"abc");
System.out.println(al);
}
}