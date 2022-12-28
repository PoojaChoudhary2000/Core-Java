public class Program4Triangle{
public static void main(String[] args){

Triangle t = new Triangle();

Triangle t1 = new Triangle(10, "red");

Triangle t2 = new Triangle(20, "blue", 30, 40);

int a = t1.getBorderWidth();
String b = t1.getColor();

int c = t2.getBorderWidth();
String d = t2.getColor();
int e = t2.getBase();
int f = t2.getHeight();

System.out.println(a);
System.out.println(b);
System.out.println();
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(f);
}
}